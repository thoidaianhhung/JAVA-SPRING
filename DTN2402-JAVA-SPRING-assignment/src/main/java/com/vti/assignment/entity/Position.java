package com.vti.assignment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "position")
public class Position {
    @Id
    @Column(name = "position_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "position_name", nullable = false)
    private PositionName positionName;

    @OneToMany(mappedBy = "position")
    private List<Account> accounts;

    public enum PositionName {
        DEV, TEST, SCRUM_MASTER, PM;
    }
}
