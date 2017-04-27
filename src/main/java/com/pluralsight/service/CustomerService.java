package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by Edge on 12/26/2016.
 */
public interface CustomerService {
    List<Customer> findAll();
}
