package com.eggmanager.mapper;

import com.eggmanager.dto.CustomerRequest;
import com.eggmanager.dto.CustomerResponse;
import com.eggmanager.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    // Mapeo de Customer a CustomerResponse
    CustomerResponse toResponse(Customer user);

    // Mapeo de CustomerRequest a Customer
    Customer toEntity(CustomerRequest customerRequest);

    // Mapeo de List<Customer> a List<CustomerResponse>
    List<CustomerResponse> toResponseList(List<Customer> users);

    // Mapeo de List<CustomerRequest> a List<Customer>
    List<Customer> toEntityList(List<CustomerRequest> customerRequest);
}
