package com.vti.assignment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "department_name", length = 50, nullable = false)
    @Enumerated(value = EnumType.STRING)
    private DepartmentName departmentName;

    @OneToMany(mappedBy = "department")
    private List<Account> accounts;

    public enum DepartmentName {
        SALE, PROTECT, PERSONNEL, TECHNIQUE, FINANCE, DIRECTOR
    }
}
