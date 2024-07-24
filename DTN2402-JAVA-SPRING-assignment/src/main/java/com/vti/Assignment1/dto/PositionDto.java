package com.vti.Assignment1.dto;

import com.vti.Assignment1.entity.Position;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PositionDto {
    private Integer id;
    private Position.PositionName positionName;
}
