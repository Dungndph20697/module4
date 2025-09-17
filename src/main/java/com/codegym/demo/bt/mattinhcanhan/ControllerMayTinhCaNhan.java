package com.codegym.demo.bt.mattinhcanhan;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
@RequestMapping("/bt/mattinhcanhan")
public class ControllerMayTinhCaNhan {

    @GetMapping("/hien-thi")
    public String hienThi() {
        return "/bt/maytinhcanhan/index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("num1") double num1,
            @RequestParam("num2") double num2,
            @RequestParam("operation") String operation,
            Model model) {

        double result = 0;
        String op = "";

        switch (operation) {
            case "add":
                result = num1 + num2;
                op = "+";
                break;
            case "sub":
                result = num1 - num2;
                op = "-";
                break;
            case "mul":
                result = num1 * num2;
                op = "×";
                break;
            case "div":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    model.addAttribute("error", "Không thể chia cho 0!");
                    return "calculator";
                }
                op = "/";
                break;
        }

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("operation", op);
        model.addAttribute("result", result);

        return "/bt/maytinhcanhan/index";
    }
}
