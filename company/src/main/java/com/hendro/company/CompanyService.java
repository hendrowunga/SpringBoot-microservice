package com.hendro.company;


import com.hendro.company.client.EmployeeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final EmployeeClient employeeClient;

    public void saveCompany(Company company){
        companyRepository.save(company);
    }
    public List<Company> findAllCompany(){
        return companyRepository.findAll();
    }

    public FullCompanyResponse findCompanyWithEmployee(Integer companyId) {
       var company=companyRepository.findById(companyId)
               .orElse(
                       Company.builder()
                               .name("NOT_FOUND")
                               .email("NOT_FOUND")
                               .build()
               );
       var employee=employeeClient.findAllEmployeeByCompany(companyId);
        return FullCompanyResponse.builder()
                .name(company.getName())
                .email(company.getEmail())
                .employeeList(employee)
                .build();
    }
}
