package com.dncoyote.minerva.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "school_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_id")
    private Long schoolId;

    @Column(name = "school_name")
    private String name;

    // @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    // private List<Student> students;
}
