package com.mathenge.spring.dao;

import com.mathenge.spring.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);
}
