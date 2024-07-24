package com.vti.Assignment1.dto;

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

    private int departmentId;

    private int positionId;

    private LocalDate createdDate;
}
