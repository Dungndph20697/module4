package com.codegym.demo.th.formvadatabinding.Controller;

import com.codegym.demo.th.formvadatabinding.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "/th/formvadatabinding/create";
    }

    @PostMapping("/create")
    public String submit(@ModelAttribute("employee") Employee employee, Model model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "/th/formvadatabinding/info";
    }


}
