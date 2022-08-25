package com.employee.app.employee.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.app.employee.app.model.Employee;

@Service
public class EmpServiceImpl implements EmpService {
	List<Employee> list;
	public EmpServiceImpl() {
		list= new ArrayList<>();
		list.add(new Employee(101,"Suranshi Maheta",20000));
		list.add(new Employee(102, "Mark Edward", 20000));
		list.add(new Employee(103, "Kim", 150000));
		list.add(new Employee(104, "Mohit Saini", 25000));
		list.add(new Employee(105, "Vijay singh", 30000));
		list.add(new Employee(106, "Rohit Sharma", 45000));
		list.add(new Employee(107, "Virat Kohli", 50000));
		list.add(new Employee(108, "Jim", 40000));
		list.add(new Employee(109, "Mona Lisa", 27000));
		list.add(new Employee(110, "Tim ", 21000));
	}
	public List<Employee> getEmployee(){
		return list;
	}
}
