package com.example.demo.exceptions;

public class EmployeenotFoundException extends RuntimeException {
 
	public EmployeenotFoundException(String msg){
		super(msg);
	}
}
