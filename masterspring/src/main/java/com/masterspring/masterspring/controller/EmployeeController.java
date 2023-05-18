package com.masterspring.masterspring.controller;

import com.masterspring.masterspring.DObjects.Employee;
import com.masterspring.masterspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService EmployeeService ;

    @PostMapping
    public String SaveEmployee(@RequestBody Employee employee) {
       Employee employee1= EmployeeService.SaveEmployee(employee);
        return employee1.toString()+"Saved";
    }

    @GetMapping
    public HashSet<Employee> getAllEmployees() {
        return EmployeeService.getAllEmployees();
    }
    @GetMapping("/test/{firstname}")
    public Optional<Employee> getEmployeebyname(@PathVariable String firstname) {

        return EmployeeService.getEmployeebyname(firstname);
//        return Optional.ofNullable(new Employee.Builder().Firstname("A").Lastname("B").setAge(20).build());
    }
    @GetMapping("/{lastname}")
    public Employee getEmployeebylastname(@PathVariable String lastname) {

        return EmployeeService.getEmployeebylastname(lastname);
//        return Optional.ofNullable(new Employee.Builder().Firstname("A").Lastname("B").setAge(20).build());
    }
    @DeleteMapping("/{lastname}")
    public String deleteEmployeebylastname(@PathVariable String lastname) {
        EmployeeService.deleteEmployeebylastname(lastname);
        return "deleted"+lastname;
//        return Optional.ofNullable(new Employee.Builder().Firstname("A").Lastname("B").setAge(20).build());
    }
}
