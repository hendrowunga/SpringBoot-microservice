package com.hendro.company;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    private String firstName;
    private String lastName;
    private String email;
}
