package com.pluralsight;

import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Edge on 12/26/2016.
 */
public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service =
                applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service);

        CustomerService service2 =
                applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service2);

        System.out.println(service.findAll().get(0).getFirstname());
    }
}
