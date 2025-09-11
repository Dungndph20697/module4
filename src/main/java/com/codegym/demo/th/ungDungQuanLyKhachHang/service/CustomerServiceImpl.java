package com.codegym.demo.th.ungDungQuanLyKhachHang.service;

import com.codegym.demo.th.ungDungQuanLyKhachHang.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Nguyen Khac Nhat", "nhat@codegym.vn", "Ha Noi"));
        customers.put(2, new Customer(2, "Dang Huy Hoa", "hoa.dang@codegym.vn", "Da Nang"));
        customers.put(3, new Customer(3, "Le Thi Chau", "chau.le@codegym.vn", "Ha Noi"));
        customers.put(4, new Customer(4, "Nguyen Thuy Duong", "duong.nguyen@codegym.vn", "Sai Gon"));
        customers.put(5, new Customer(5, "CodeGym", "codegym@codegym.vn", "Viet Nam"));
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer getCustomerById(int id) {
        return customers.get(id);
    }
}
