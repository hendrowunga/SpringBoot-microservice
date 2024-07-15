package com.hendro.company;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Company company){
        companyService.saveCompany(company);
    }


    @GetMapping
    public ResponseEntity<List<Company>> findAllCompany(){
        return ResponseEntity.ok(companyService.findAllCompany());
    }


    @GetMapping("/with-employee/{company-id}")
    public ResponseEntity<FullCompanyResponse> findAllCompany(@PathVariable("company-id") Integer companyId){

        return ResponseEntity.ok(companyService.findCompanyWithEmployee(companyId));
    }
}
