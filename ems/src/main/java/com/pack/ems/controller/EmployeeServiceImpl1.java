package com.pack.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.ems.entity.Employee;
import com.pack.ems.repository.EmployeeRepository;
@Service("service")
public class EmployeeServiceImpl1 implements IEmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	
	
	@Override
	public boolean doSomething(Integer empNo) {
		return repository.existsById(empNo);
		

	}
	
	public void saveEmployee(Employee emp)
	{
		repository.save(emp);
		
	}
	
	public void test(Employee emp)
	{
		repository.save(emp);
		
	}
	public void test1(Employee emp)
	{
		repository.save(emp);
		
	}
	public void test2(Employee emp)
	{
		repository.save(emp);
		
	}

	public void test3(Employee emp)
	{
		repository.save(emp);
		
	}

	public void test4(Employee emp)
	{
		repository.save(emp);
		
	}
}
