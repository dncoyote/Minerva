package com.dncoyote.minerva.mapper;

import com.dncoyote.minerva.dto.StudentRequestDto;
import com.dncoyote.minerva.entity.Student;

public class StudentMapper {

    public static StudentRequestDto mapToStudentDto(Student student) {
        return new StudentRequestDto(student.getStudentId(), student.getFirstName(), student.getLastName(),
                student.getEmailId(), student.getSchool().getSchoolId(), student.getSchool());
    }

    public static Student mapToStudent(StudentRequestDto studentDto) {
        return new Student(studentDto.getStudentId(), studentDto.getFirstName(), studentDto.getLastName(),
                studentDto.getEmailId(), studentDto.getSchool());
    }
}
