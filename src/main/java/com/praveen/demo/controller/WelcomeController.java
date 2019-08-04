package com.praveen.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praveen.demo.service.CustomerService;
import com.praveen.demo.vo.Customer;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class WelcomeController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		customerService.createCustomer();
		
		  try { 
			  throw new RuntimeException("test exceptions"); } catch (Exception e) {
				  log.error("An exception occurred!", e); 
			  }
		  
		  log.info("Testing logs");
		 
		
		return "hello";
	}

	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Customer customer) {
		System.out.println(customer.getDob());
		return "hello";
	}

}
