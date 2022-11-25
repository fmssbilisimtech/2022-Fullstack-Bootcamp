package com.turkcell.restapibestpractices.service;


import com.turkcell.restapibestpractices.client.dto.response.CustomerDto;
import com.turkcell.restapibestpractices.client.dto.request.CreateCustomerRequest;
import com.turkcell.restapibestpractices.client.dto.request.UpdateCustomerRequest;
import com.turkcell.restapibestpractices.exception.CustomerNotFoundException;
import com.turkcell.restapibestpractices.mapper.CustomerMapper;
import com.turkcell.restapibestpractices.model.enums.City;
import com.turkcell.restapibestpractices.model.Customer;
import com.turkcell.restapibestpractices.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
   private final CustomerMapper customerMapper;



    public CustomerDto createCustomer(CreateCustomerRequest customerRequest){

        Customer customer = customerMapper.toCustomerFromCreateCustomerRequest(customerRequest);

        return customerMapper.toCustomerDto(customerRepository.save(customer));
    }

    public List<CustomerDto> getAllCustomers() {
        List<Customer> customerList = customerRepository.findAll();

       return customerList.stream()
               .map(customerMapper::toCustomerDto)
               .collect(Collectors.toList());

    }

    @Transactional
    public CustomerDto getCustomerDtoById(Long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);

        return customerOptional.map(customerMapper::toCustomerDto)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not exist!"));
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public CustomerDto updateCustomer(Long id, UpdateCustomerRequest customerRequest) {
        Optional<Customer> customerOptional = customerRepository.findById(id);

        customerOptional.ifPresent(customer -> {
            customer.setName(customerRequest.getName());
            customer.setCity(City.valueOf(customerRequest.getCity().name()));
            customer.setBirthDate(customerRequest.getBirthDate());
            customerRepository.save(customer);
        });

        return customerOptional.map(customerMapper::toCustomerDto)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found!"));
    }

    protected Customer getCustomerById(long id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found!"));
    }
}