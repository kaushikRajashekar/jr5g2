package com.cg.creditcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcard.entity.Customer;
import com.cg.creditcard.service.CustomerService;
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@PostMapping("/addCustomer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
		return new ResponseEntity<String>("Customer inserted",HttpStatus.OK);
		}
	
	@DeleteMapping("/deleteCustomer")
	public ResponseEntity<String> removeCustomer(@RequestParam int userid) {
		service.removeCustomer(userid);
		return new ResponseEntity<String>("Customer Deleted", HttpStatus.OK);
	}
	
	@GetMapping("/getCustomer")
	public ResponseEntity<Customer> getCustomer(@RequestParam int userid) {
		Customer customer = service.getCustomer(userid);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@PutMapping("/updateCustomer")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer,@RequestParam int userid) {
		service.updateCustomer(userid, customer);
		return new ResponseEntity<String>("Successfully updated", HttpStatus.OK); 
	}
	@GetMapping("/selectAll")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		List<Customer> customerList = service.getAllCustomer();
		return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
	}

}
