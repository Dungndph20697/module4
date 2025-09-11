package com.codegym.demo.bt.ungDungQuanLyTienTe;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hien-thi")
    public String hienThi() {
        return "/bt/chuyenDoiTienTe/chuyendoitiente";
    }

    @PostMapping("/tinh-toan" )
    public String tinhToan(@ModelAttribute("usd") String usd, Model model) {
        double vnd = Double.valueOf(usd) * 23000;
        model.addAttribute("vnd", vnd);
        return "/bt/chuyenDoiTienTe/chuyendoitiente";
    }
}
