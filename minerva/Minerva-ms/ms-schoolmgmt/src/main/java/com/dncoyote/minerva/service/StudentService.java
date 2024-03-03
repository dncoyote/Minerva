package com.dncoyote.minerva.service;

import com.dncoyote.minerva.dto.StudentRequestDto;
import com.dncoyote.minerva.entity.Student;

public interface StudentService {
    public Student createStudent(StudentRequestDto studentDto);

}
