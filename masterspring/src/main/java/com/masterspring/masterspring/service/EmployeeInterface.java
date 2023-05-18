package com.masterspring.masterspring.service;

import com.masterspring.masterspring.DObjects.Employee;

import java.util.HashSet;
import java.util.Optional;

public interface EmployeeInterface {
    public Employee SaveEmployee(Employee employee);

    public HashSet<Employee> getAllEmployees();

    public Optional<Employee> getEmployeebyname(String firstname);

    public Employee getEmployeebylastname(String lastname);

    public  String deleteEmployeebylastname(String lastname);
}
