package com.vti.assignment.form;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentUpdateForm {
    @Pattern(regexp = "SALE|PROTECT|PERSONNEL|TECHNIQUE|FINANCE|DIRECTOR")
    private String departmentName;
}
