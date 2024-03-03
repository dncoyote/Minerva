package com.dncoyote.minerva.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mark_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mark_id")
    private Long id;

    @Column(name = "mark_score")
    private int score;

    @Column(name = "mark_subject")
    private String subject;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}