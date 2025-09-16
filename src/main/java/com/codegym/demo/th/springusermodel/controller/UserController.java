package com.codegym.demo.th.springusermodel.controller;

import com.codegym.demo.th.springusermodel.DAO.UserDao;
import com.codegym.demo.th.springusermodel.model.Login;
import com.codegym.demo.th.springusermodel.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/th/springusermodel")
public class UserController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/th/usermodel/home");
        modelAndView.addObject("login", new Login());
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserDao.checkLogin(login);
        ModelAndView modelAndView;
        if(user == null){
            modelAndView = new ModelAndView("/th/usermodel/error");
        } else {
            modelAndView = new ModelAndView("/th/usermodel/user");
            modelAndView.addObject("user", user);
        }
        return modelAndView;
    }
}
