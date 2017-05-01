package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 12/25/2016.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    private String dbUsername;

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();

        customer.setFirstname("Sailesh");
        customer.setLastname("Kasaju");

        customers.add(customer);
        return customers;
    }
}
