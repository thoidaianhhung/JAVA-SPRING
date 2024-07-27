package com.vti.assignment.mapper;

import com.vti.assignment.dto.DepartmentDto;
import com.vti.assignment.entity.Department;
import com.vti.assignment.form.DepartmentCreateForm;
import com.vti.assignment.form.DepartmentUpdateForm;

public class DepartmentMapper {
    public static Department map(DepartmentCreateForm form) {
        var department = new Department();
        department.setDepartmentName(Department.DepartmentName.valueOf(form.getDepartmentName()));
        return department;
    }

    public static DepartmentDto map(Department department) {
        var dto = new DepartmentDto();
        dto.setId(department.getId());
        dto.setDepartmentName(department.getDepartmentName());
        return dto;
    }

    public static void map(DepartmentUpdateForm form, Department department) {
        department.setDepartmentName(Department.DepartmentName.valueOf(form.getDepartmentName()));
    }
}
