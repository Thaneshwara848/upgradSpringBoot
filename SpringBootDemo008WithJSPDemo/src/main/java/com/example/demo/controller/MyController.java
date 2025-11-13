package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.servicess.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @Autowired
    private EmployeeService service;

    // Home -> list
    @GetMapping("/")
    public String home() {
        return "redirect:/employees";
    }

    // List page
    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("emps", service.getAllEmployees());
        return "employees-list";
    }

    // Show empty form (Create)
    @GetMapping("/employees/new")
    public String showCreateForm(Model model) {
        model.addAttribute("emp", new Employee());
        return "employees-form";
    }

    // Handle form submit (POST)
    @PostMapping("/employees")
    public String saveEmployee(@ModelAttribute("emp") Employee emp) {
        service.addEmployee(emp);
        return "redirect:/employees";
    }

    // View details
    @GetMapping("/employees/{id}")
    public String viewEmployee(@PathVariable Integer id, Model model) {
        var emp = service.getEmployeeById(id).orElse(null);
        model.addAttribute("emp", emp);
        return "employees-view";
    }

    // Delete (simple GET link for demo)
    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        service.deleteEmployeeById(id);
        return "redirect:/employees";
    }
}
