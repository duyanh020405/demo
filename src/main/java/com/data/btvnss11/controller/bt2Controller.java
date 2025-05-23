package com.data.btvnss11.controller;

import com.data.btvnss11.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class bt2Controller {
    @GetMapping("/formbt2")
    public String BindingResult (Model model) {
        model.addAttribute("login" , new Login());
        return "formbt2";
    }

    @PostMapping("/resultbt2")
    public String BindingResult2(Model model , @Valid @ModelAttribute("login") Login login , BindingResult bindingResult ) {
        if (bindingResult.hasErrors()) {
//            model.addAttribute("mess" , "Loi :" +bindingResult.getAllErrors());
            return "resultbt2";
        }
        else {
            model.addAttribute("email" , login.getEmail());
            model.addAttribute("password" , login.getPassword());
            return "resultbt2";
        }

    }
}
