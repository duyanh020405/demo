package com.data.btvnss11.controller;


import com.data.btvnss11.model.User_bt5;
import com.data.btvnss11.model.User_bt6;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/register2")
    public String showForm(Model model) {
        model.addAttribute("user", new User_bt6());
        return "register_bt6";
    }

    @PostMapping("/register2")
    public String submitForm(@Valid @ModelAttribute("user") User_bt6 user,
                             BindingResult result,
                             Model model) {
        String phone = user.getPhone();
        if (phone == null || !phone.matches("^0\\d{9}$")) {
            result.rejectValue("phone", null, "Số điện thoại không hợp lệ (bắt đầu bằng 0 và có 10 chữ số)");
        }
        if (result.hasErrors()) {
            return "register_bt6";
        }
        model.addAttribute("message", "Đăng ký thành công!");
        return "register_bt6";
    }
}

