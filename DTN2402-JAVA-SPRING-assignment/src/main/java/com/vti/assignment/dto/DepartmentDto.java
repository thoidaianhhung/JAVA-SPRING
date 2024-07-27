package com.vti.assignment.dto;


import com.vti.assignment.entity.Department;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentDto {
    private Integer id;

    private Department.DepartmentName departmentName;
}
