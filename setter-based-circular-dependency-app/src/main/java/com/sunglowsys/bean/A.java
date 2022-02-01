package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    private B b;

    @Autowired
    public A(B b){
        this.b = b;
    }
   /* @Autowired
    public B getB(){
        return b;
    }
    public void setB(){
        this.b = b;
    }*/
    public void getA(){
        System.out.println("from A");
        System.out.println(b);
    }
}
