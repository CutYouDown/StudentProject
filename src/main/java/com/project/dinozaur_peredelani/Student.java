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
    Integer id;
    @Column
    String name;
    @Column(name = "group-id", insertable = false, updatable = false)
    Integer groupId;
    @ManyToOne
    @JoinColumn(name = "group-id")
    private Group group;


}
