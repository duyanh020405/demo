package com.data.btvnss11.controller;

import com.data.btvnss11.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class bt1Controller {

        @GetMapping("/formbt1")
        public String formbt1(Model model) {
            model.addAttribute("user", new User());
            return "formbt1";
        }

        @PostMapping("/resultbt1")
        public String resultbt1(
                @Valid @ModelAttribute("user") User user,
                BindingResult bindingResult,
                Model model) {

            if (bindingResult.hasErrors()) {

                return "formbt1";
            }

            model.addAttribute("user", user);
            return "resultbt1";
        }
    }
