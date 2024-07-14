package com.hendro.company;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullCompanyResponse {

    private String name;
    private String email;
    List<Employee> employeeList;

}
