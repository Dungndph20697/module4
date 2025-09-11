package com.codegym.demo.th.ungDungQuanLyKhachHang.service;

import com.codegym.demo.th.ungDungQuanLyKhachHang.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(int id);
}
