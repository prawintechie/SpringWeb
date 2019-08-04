package com.praveen.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;

import com.praveen.demo.vo.Customer;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping(value = "/session")
	public Customer session() {
		Customer customer = new Customer();
		customer.setDob(new Date());
		return customer;
		
	}

}
