package com.mathenge.spring.dao;

import com.mathenge.spring.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Customer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();

        Query<Customer> theQuery = session.createQuery("from Customer", Customer.class);

        List<Customer> customers = theQuery.getResultList();

        return customers;
    }

    public void saveCustomer(Customer customer) {

        Session session = sessionFactory.getCurrentSession();

        session.save(customer);
    }
}
