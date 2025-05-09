package com.mypyme.mypyme.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String jobTitle;

    private String departmentName;

}
