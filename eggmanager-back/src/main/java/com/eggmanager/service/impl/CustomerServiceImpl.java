package com.eggmanager.service.impl;

import com.eggmanager.dto.CustomerRequest;
import com.eggmanager.dto.CustomerResponse;
import com.eggmanager.entity.Customer;
import com.eggmanager.mapper.CustomerMapper;
import com.eggmanager.repository.CustomerRepository;
import com.eggmanager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public CustomerResponse getCustomerById(Long customerId) {
        Customer customer = customerRepository.getReferenceById(customerId);
        return customerMapper.toResponse(customer);
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customerMapper.toResponseList(customers);
    }

    @Override
    public CustomerResponse create(CustomerRequest customerRequest) {
        Customer customer = customerRepository.save(customerMapper.toEntity(customerRequest));
        return customerMapper.toResponse(customer);
    }

    @Override
    public CustomerResponse update(CustomerRequest customerRequest) {
        Customer customer = customerRepository.getReferenceById(customerRequest.getId());
        customer.update(customerRequest);
        customer = customerRepository.save(customer);
        return customerMapper.toResponse(customer);
    }

    @Override
    public boolean delete(Long customerId) {
        customerRepository.deleteById(customerId);
        return true;
    }
}
