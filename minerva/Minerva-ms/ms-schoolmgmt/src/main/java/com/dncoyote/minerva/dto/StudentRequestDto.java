package com.dncoyote.minerva.dto;

import com.dncoyote.minerva.entity.School;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {
    private Long studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private Long schoolId;
    private School school;
}
