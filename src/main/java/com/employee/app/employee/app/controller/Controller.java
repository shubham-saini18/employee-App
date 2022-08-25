package com.employee.app.employee.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.app.employee.app.model.Employee;
import com.employee.app.employee.app.service.EmpService;

@RestController
public class Controller {
	@Autowired
	private EmpService  emp;
	@GetMapping("/emp")
	public List<Employee> getEmployeelist()
	{
		return this.emp.getEmployee();
}
}