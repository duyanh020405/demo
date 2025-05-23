package com.data.btvnss11.controller;


import com.data.btvnss11.model.Review;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ReviewController {

    @GetMapping("/review")
    public String showForm(Model model) {
        model.addAttribute("review", new Review());
        return "reviewForm";
    }
    @PostMapping("/review")
    public String submitForm(
            @Valid @ModelAttribute("review") Review review,
            BindingResult result,
            Model model
    ) {
        if (result.hasErrors()) {
            return "reviewForm";
        }
        model.addAttribute("message", "Cảm ơn bạn đã gửi đánh giá!");
        return "reviewForm";
    }

}
