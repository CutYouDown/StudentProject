package com.project.dinozaur_peredelani;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    Integer groupId;
    @ManyToOne
    @JoinColumn(name = "group-id", nullable = false)
    private Group group;


}
