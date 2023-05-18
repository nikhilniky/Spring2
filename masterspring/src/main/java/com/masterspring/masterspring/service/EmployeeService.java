package com.masterspring.masterspring.service;

import com.masterspring.masterspring.DObjects.Employee;
import com.masterspring.masterspring.exception.CustomException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeInterface {

    HashSet<Employee> employeeList = new HashSet<>();

    public Employee SaveEmployee(Employee employee) {
      boolean bool=  employeeList.add(employee);
        System.out.println("added" +bool);
        return employee;
    }

    @Override
    public HashSet<Employee> getAllEmployees() {
        return employeeList;
    }
    public Optional<Employee> getEmployeebyname(String firstname) {
        return Optional.of(employeeList.stream()
                .filter(employee ->
                        employee.getFirstname()
                                .equals(firstname)).findFirst().get());
    }

    @Override
    public Employee getEmployeebylastname(String lastname) {
        return employeeList.stream()
                .filter(employee -> employee.getLastname().equals(lastname)).findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public String deleteEmployeebylastname(String lastname) {
       Employee list = employeeList.stream()
                .filter(employee -> employee.getLastname().equals(lastname)).findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        employeeList.remove(list);
        System.out.println("deleted");
        return "deleted";
    }


}
