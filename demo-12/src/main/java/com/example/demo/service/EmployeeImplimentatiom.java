package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class EmployeeImplimentatiom {

	public List <Employee1> getEmployee1() {
		
		return List.of(new Employee1(1,"sai",123,"hyd"),new Employee1(2,"kumai",123,"hmnd"));
	}
	
	

}
