package com.codegym.demo.bt.ungdunghienthigiavi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/bt/ungdunghienthigiavi")
public class ControllerHienThiGiaVi {

    @RequestMapping("/sandwich")
    public String showForm() {
        return "/bt/ungdunghienthigiavi/sandwich";
    }

    @PostMapping("/saveCondiments")
    public String saveCondiments(
            @RequestParam(value = "condiment", required = false) List<String> condiments,
            Model model) {
        if (condiments != null && !condiments.isEmpty()) {
            model.addAttribute("condiments", condiments);
        } else {
            model.addAttribute("message", "Bạn chưa chọn gia vị nào!");
        }
        return "/bt/ungdunghienthigiavi/result";
    }
}
