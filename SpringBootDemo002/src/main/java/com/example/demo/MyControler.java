package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControler {
	ArrayList<Employee> emp = new ArrayList<Employee>();
	
	MyControler(){
		emp.add(new Employee(1, "Abi",25,25000,"Developer"));
		emp.add(new Employee(2, "Bindu",25,25000,"Developer"));
		emp.add(new Employee(3, "Chadu",25,25000,"Developer"));
	}
	
	@GetMapping("/getAllEmployee")
	public ArrayList<Employee> allEmployee() {
		// this API is ment for to fetch all employee 
		return emp;
	}
	
	@GetMapping("/getAllEmployeeById/{uid}")
	public Employee allEmployeeById(@PathVariable int uid) {
        // Find employee by ID
        for (Employee e : emp) {
            if (e.getUid() == uid) {
                return e;
            }
        }
        // If ID not found, return null or a dummy object
        return null;
    }
	@PostMapping("addEmployee")
	public String addEmployees(@RequestBody Employee myemps) {
		emp.add(myemps);
	return  "Employee Added Successfully....!";
	}
	
	@DeleteMapping("deleteEmployeeeById/{uid}")
	public String deleteEmployee(@PathVariable int uid) {
        // Find employee by ID
        for (Employee e : emp) {
            if (e.getUid() == uid) {
            	emp.remove(uid);
                return "EMployee Deleted Successfully....!";
            }
        }
        // If ID not found, return null or a dummy object
        return "No EMployee Found  on this "+ uid;
    }
	
	@DeleteMapping("deleteAllEmployeee")
	public String deleteAllEmployee() {
       
		emp.clear();
        return "All EMployee Deleted ....! ";
    }
	
	// ✅ Update employee salary by ID
    @PutMapping("/updateSalaryById/{uid}/{newSalary}")
    public String updateSalary(@PathVariable int uid, @PathVariable int newSalary) {
        for (Employee e : emp) {
            if (e.getUid() == uid) {
                e.setSalary(newSalary);
                return "Employee Salary Updated Successfully! New Salary: " + newSalary;
            }
        }
        return "Employee Not Found with ID: " + uid;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
