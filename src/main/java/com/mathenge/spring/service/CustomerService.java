package com.mathenge.spring.service;

import com.mathenge.spring.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);
}
