package com.turkcell.restapibestpractices.repository;

import com.turkcell.restapibestpractices.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
