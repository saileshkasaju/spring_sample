package com.pluralsight;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

/**
 * Created by Edge on 12/26/2016.
 */
public class Application {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
