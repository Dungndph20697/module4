package com.codegym.demo.th.ungDungQuanLyKhachHang.controller;

import com.codegym.demo.th.ungDungQuanLyKhachHang.model.Customer;
import com.codegym.demo.th.ungDungQuanLyKhachHang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/th-ungDungQuanLyKhachHang")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView showListCustomer() {
        ModelAndView modelAndView = new ModelAndView("/th/ungDungQuanLyKhachHang/list");
        List<Customer> customers = customerService.getAllCustomers();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/customers/detail")
    public ModelAndView showDetail(@RequestParam("id") int customerId) {
        ModelAndView modelAndView = new ModelAndView("/th/ungDungQuanLyKhachHang/info");
        Customer customer = customerService.getCustomerById(customerId);
        System.out.println(customer);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
