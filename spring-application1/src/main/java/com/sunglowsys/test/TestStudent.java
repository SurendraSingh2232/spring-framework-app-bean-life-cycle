package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student obj = (Student) context.getBean("student");
        obj.getId();
        obj.getFirstName();
        obj.getLastName();
        obj.getEmail();
        obj.getMobile();
        obj.getStandard();

    }
}
