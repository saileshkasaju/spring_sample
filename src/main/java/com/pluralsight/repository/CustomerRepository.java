package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by Edge on 12/25/2016.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
