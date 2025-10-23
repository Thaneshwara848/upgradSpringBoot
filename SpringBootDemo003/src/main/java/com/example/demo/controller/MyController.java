package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employee;
import com.example.demo.servicess.EmployeeServiceImpl;

@RestController
public class MyController {

    @Autowired
    private EmployeeServiceImpl service;

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {
        return service.getAllEmployees();
    }

    @GetMapping("/getAllEmployeeById/{uid}")
    public Optional<Employee> allEmployeeById(@PathVariable int uid) {
        return service.getEmployeeById(uid);
    }

    @PostMapping("/addEmployee")
    public String addEmployees(@RequestBody Employee myemps) {
        return service.addEmployee(myemps);
    }

    @PutMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmp) {
        return service.updateEmployee(id, updatedEmp);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        return service.deleteEmployeeById(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllEmployeeById() {
        return service.deleteAllEmployees();
    }
}
