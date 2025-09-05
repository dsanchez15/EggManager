package com.eggmanager.controller;

import com.eggmanager.dto.CustomerRequest;
import com.eggmanager.dto.CustomerResponse;
import com.eggmanager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public CustomerResponse getById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/all")
    public List<CustomerResponse> getCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public CustomerResponse create(@RequestBody CustomerRequest customerRequest) {
        return customerService.create(customerRequest);
    }

    @PutMapping("/update")
    public CustomerResponse update(@RequestBody CustomerRequest customerRequest) {
        return customerService.update(customerRequest);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id) {
        return customerService.delete(id);
    }
}
