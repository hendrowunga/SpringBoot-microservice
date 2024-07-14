package com.hendro.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository <Employee,Integer>{

    List<Employee> findAllByCompanyId(Integer companyId);
}
