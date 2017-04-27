package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by Edge on 12/25/2016.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
