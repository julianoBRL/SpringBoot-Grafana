package io.github.juliano.cratheus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.juliano.cratheus.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);
  Customer findById(long id);
  
}