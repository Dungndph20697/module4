package com.codegym.demo.bt.tuDien;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bt-tuDien")
public class TuDienController {

    @GetMapping("/hien-thi")
    public String hienThi() {
        return "/bt/tuDien/tudien";
    }

    @PostMapping("/dich-van-ban" )
    public String dich(@ModelAttribute("request") String request, Model model) {
        String result = "";
        switch (request) {
            case "hello":
                result = "xin chào";
                break;
            case "how":
                result = "thế nào";
                break;
            case "book":
                result = "quyển vở";
                break;
            case "computer":
                result = "máy tính";
                break;
            default:
                result = "không tìm thấy từ";
        }
        model.addAttribute("result", result);
        return "/bt/tuDien/tudien";
    }
}
