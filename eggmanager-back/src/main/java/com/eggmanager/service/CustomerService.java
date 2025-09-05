package com.eggmanager.service;

import com.eggmanager.dto.CustomerRequest;
import com.eggmanager.dto.CustomerResponse;

import java.util.List;

public interface CustomerService {

    CustomerResponse getCustomerById(Long customerId);

    List<CustomerResponse> getAllCustomers();

    CustomerResponse create(CustomerRequest customerRequest);

    CustomerResponse update(CustomerRequest customerRequest);

    boolean delete(Long customerId);
}
