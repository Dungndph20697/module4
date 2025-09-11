package com.codegym.demo.bt.ungDungQuanLyTienTe;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping("/bt-chuyenDoiTienTe")
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
