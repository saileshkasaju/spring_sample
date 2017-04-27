package com.pluralsight;

import com.pluralsight.service.CustomerService;
//import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Edge on 12/26/2016.
 */
public class Application {
    public static void main(String[] args) {
//        CustomerService service = new CustomerServiceImpl();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
