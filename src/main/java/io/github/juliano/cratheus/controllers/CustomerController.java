package io.github.juliano.cratheus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.juliano.cratheus.models.Customer;
import io.github.juliano.cratheus.repository.CustomerRepository;

@RequestMapping("/customer")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository repository;
	
	@GetMapping
	private Iterable<Customer> get() {
		return repository.findAll();
	}
	
	@PostMapping
	private Customer post(@RequestBody Customer costumer) {
		return repository.save(costumer);
	}

}
