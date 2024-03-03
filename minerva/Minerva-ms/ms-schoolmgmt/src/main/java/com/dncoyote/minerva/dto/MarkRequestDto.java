package com.dncoyote.minerva.dto;

import com.dncoyote.minerva.entity.Student;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MarkRequestDto {
    private Long id;
    private int score;
    private String subject;
    private Long studentId;
    private Student student;
}
