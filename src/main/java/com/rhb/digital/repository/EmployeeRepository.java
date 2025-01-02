package com.rhb.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rhb.digital.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	   @Query("SELECT e FROM Employee e JOIN FETCH e.department d WHERE d.name = :departmentName")
	    List<Employee> findByDepartmentName(String departmentName);
}