package com.vti.assignment.mapper;

import com.vti.assignment.dto.PositionDto;
import com.vti.assignment.entity.Position;
import com.vti.assignment.form.PositionCreateForm;
import com.vti.assignment.form.PositionUpdateForm;

public class PositionMapper {
    public static Position map(PositionCreateForm form) {
        var position = new Position();
        position.setPositionName(Position.PositionName.valueOf(form.getPositionName()));
        return position;
    }

    public static PositionDto map(Position position) {
        var dto = new PositionDto();
        dto.setId(position.getId());
        dto.setPositionName(position.getPositionName());
        return dto;
    }

    public static void map(PositionUpdateForm form, Position position) {
        position.setPositionName(Position.PositionName.valueOf(form.getPositionName()));
    }
}
