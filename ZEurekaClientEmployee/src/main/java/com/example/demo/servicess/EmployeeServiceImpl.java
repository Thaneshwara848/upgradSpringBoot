package com.example.demo.servicess;

import com.example.demo.exceptions.EmployeenotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repo.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private MyRepo repo;

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return Optional.ofNullable(
            repo.findById(id)
                .orElseThrow(() -> new EmployeenotFoundException("Employee not found with ID: " + id))
        );
    }

    @Override
    public String addEmployee(Employee emp) {
        repo.save(emp);
        return "Employee Added Successfully!";
    }

    @Override
    public String updateEmployee(int id, Employee updatedEmp) {
        Optional<Employee> existing = repo.findById(id);
        if (existing.isPresent()) {
            Employee emp = existing.get();
            emp.setName(updatedEmp.getName());
            emp.setAge(updatedEmp.getAge());
            emp.setSalary(updatedEmp.getSalary());
            emp.setDesig(updatedEmp.getDesig());
            repo.save(emp);
            return "Employee Updated Successfully!";
        } else {
            throw new EmployeenotFoundException("Cannot update — Employee not found with ID: " + id);
        }
    }

    @Override
    public String deleteEmployeeById(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Employee Deleted Successfully!";
        } else {
            throw new EmployeenotFoundException("Cannot delete — Employee not found with ID: " + id);
        }
    }

    @Override
    public String deleteAllEmployees() {
        repo.deleteAll();
        return "All Employees Deleted Successfully!";
    }
}
