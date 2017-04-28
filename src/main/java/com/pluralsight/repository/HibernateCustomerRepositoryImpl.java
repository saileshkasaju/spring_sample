package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 12/25/2016.
 */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();

        customer.setFirstname("Sailesh");
        customer.setLastname("Kasaju");

        customers.add(customer);
        return customers;
    }
}
