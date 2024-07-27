package com.vti.assignment.dto;

import com.vti.assignment.entity.Department;
import com.vti.assignment.entity.Position;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AccountDto {
    private Integer id;

    private String email;

    private String userName;

    private String fullName;

    private Department departmentId;

    private Position positionId;

    private LocalDate createdDate;
}
