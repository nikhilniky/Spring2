package com.masterspring.masterspring.DObjects;

import java.util.UUID;

public class Employee {

    private String firstname;
    private String lastname;
    private int age;

//    private UUID employeeId;

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee() {
    }

    public Employee(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }


    private Employee(Employee.Builder builder) {
        this.firstname = builder.firstname;
        this.age = builder.age;
        this.lastname = builder.lastname;
    }

    public static  class Builder {
        private String firstname;
        private String lastname;
        private int age;

        public Builder() {
        }

        public Builder Firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder Lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }
    }


}
