package com.sunglowsys.domain;

import java.util.Objects;

public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String standard;

    public void getId() {
        System.out.println("id = "+id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void getFirstName() {
        System.out.println("firstName = " +firstName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void getLastName() {
        System.out.println("lastName = " +lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getEmail() {
        System.out.println("email = " +email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getMobile() {
        System.out.println("mobile = "+mobile);
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void getStandard() {
        System.out.println("standard = "+standard);
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(email, student.email) && Objects.equals(mobile, student.mobile) && Objects.equals(standard, student.standard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, mobile, standard);
    }

}
