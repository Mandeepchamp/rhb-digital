package com.rhb.digital.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rhb.digital.entity.Employee;
import com.rhb.digital.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<Page<Employee>> getEmployees(@RequestParam int page, @RequestParam int size) {
        return ResponseEntity.ok(employeeService.getAllEmployees(page, size));
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    @GetMapping("/external-api")
    public ResponseEntity<String> callExternalApi() {
        return ResponseEntity.ok(employeeService.callExternalApi());
    }
}

