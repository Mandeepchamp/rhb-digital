package com.rhb.digital.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.rhb.digital.entity.Employee;
import com.rhb.digital.repository.EmployeeRepository;
import com.rhb.digital.utils.ApiClient;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ApiClient apiClient;

    public Page<Employee> getAllEmployees(int page, int size) {
        return employeeRepository.findAll(PageRequest.of(page, size));
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public String callExternalApi() {
        return apiClient.getDataFromGoogle();
    }
}

