package com.hendro.employee;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }
    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    public List<Employee> findAllEmployeeByCompany(Integer companyId) {
        return employeeRepository.findAllByCompanyId(companyId);
    }
}
