package com.vti.assignment.form;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PositionUpdateForm {
    @Pattern(regexp = "DEV|TEST|SCRUM_MASTER|PM")
    private String positionName;
}
