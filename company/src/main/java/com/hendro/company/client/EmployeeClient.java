package com.hendro.company.client;

import com.hendro.company.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="employee-service",url="${application.config.employee-url}")
public interface EmployeeClient {

    @GetMapping("/company/{company-id}")
    List<Employee> findAllEmployeeByCompany(@PathVariable("company-id") Integer companyId);
}
