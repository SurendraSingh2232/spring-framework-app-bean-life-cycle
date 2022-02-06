package com.sunglowsys.test;

import com.sunglowsys.config.JavaConfiguration;
import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        System.out.println("Surendra Singh");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Customer customer = context.getBean(Customer.class);
        customer.getFirstName();
        customer.getId();
        customer.getLastName();
        customer.getEmail();
        customer.getGender();
        customer.getMobile();
        System.out.println(customer);
        System.out.println(customer.hashCode());

        Address address = context.getBean(Address.class);
        address.getAddressLine1();
        address.getCountry();
        address.getState();
        address.getStreet();
        address.getZipcode();
        address.getId();
        System.out.println(address);
        System.out.println(address.hashCode() );

    }
}
