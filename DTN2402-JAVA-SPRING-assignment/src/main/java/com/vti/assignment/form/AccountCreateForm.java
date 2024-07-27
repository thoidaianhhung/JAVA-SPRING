package com.vti.assignment.form;

import com.vti.assignment.entity.Department;
import com.vti.assignment.entity.Position;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCreateForm {
    private String email;

    private String userName;

    private String fullName;
}
