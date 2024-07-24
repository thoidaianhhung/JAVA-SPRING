package com.vti.Assignment1.form;

import com.vti.Assignment1.entity.Department;
import com.vti.Assignment1.entity.Position;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AccountUpdateForm {

    private String email;

    private String userName;

    private String fullName;

    private Department departmentId;

    private Position positionId;

}
