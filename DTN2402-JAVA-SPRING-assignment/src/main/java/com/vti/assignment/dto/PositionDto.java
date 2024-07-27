package com.vti.assignment.dto;

import com.vti.assignment.entity.Position;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PositionDto {
    private Integer id;
    private Position.PositionName positionName;
}
