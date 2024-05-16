package com.project.dinozaur_peredelani;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "groups")
@Getter
@Setter
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<Student> students;
}
