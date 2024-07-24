package com.vti.Assignment1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "position")
public class Position {
    @Id
    @Column(name = "position_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "position_name", nullable = false)
    private PositionName positionName;

    public enum PositionName {
        DEV, TEST, SCRUM_MASTER, PM;
    }
}
