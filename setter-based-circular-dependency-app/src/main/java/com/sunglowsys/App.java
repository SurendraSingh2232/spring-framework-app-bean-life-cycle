package com.sunglowsys;

import com.sunglowsys.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Surendra Singh" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.sunglowsys.bean");
        context.scan("com.sunglowsys.service");
        context.refresh();

        Service service = context.getBean(Service.class);
        service.service();
        context.close();
    }
}
