package com.example.demo.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
									// model --> Bean Class--> Encupulated class --> POJO(Plane old java Obj) 
@Entity								// this is table name as a CLASS name
@Table(name="MyEmployee")	// we can change the table name also 
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Employee {
	
	@Id
    @Positive(message = "ID must be a positive number")
    private int id;

    @Column(name = "Username")
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name must contain only alphabets and spaces")
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 60, message = "Age cannot exceed 60")
    private int age;

    @Min(value = 25000, message = "Salary must be at least 25,000")
    private int salary;

    @Column(name = "Designation")
    @NotBlank(message = "Designation cannot be blank")
    private String desig;

	// 70 lines -- that we can replace with help of LOMBOK
}
