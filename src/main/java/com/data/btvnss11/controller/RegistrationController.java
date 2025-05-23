package com.data.btvnss11.controller;

import com.data.btvnss11.model.User_bt5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User_bt5());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(
            @Valid @ModelAttribute("user") User_bt5 user,
            BindingResult result,
            Model model
    ) {
        // Kiểm tra logic riêng cho admin
        if ("admin".equalsIgnoreCase(user.getRole())) {
            if (user.getAdminCode() == null || user.getAdminCode().isBlank()) {
                result.rejectValue("adminCode", null, "Admin cần nhập mã xác thực");
            }
        }

        if (result.hasErrors()) {
            return "register";
        }

        model.addAttribute("message", "Đăng ký thành công!");
        return "register";
    }
}
