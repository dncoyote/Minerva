package com.dncoyote.minerva.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dncoyote.minerva.dto.StudentRequestDto;
import com.dncoyote.minerva.entity.School;
import com.dncoyote.minerva.entity.Student;
import com.dncoyote.minerva.mapper.StudentMapper;
import com.dncoyote.minerva.repository.SchoolRepository;
import com.dncoyote.minerva.repository.StudentRepository;
import com.dncoyote.minerva.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SchoolRepository schoolRepository;

    // public List<Student> getAllStudents() {
    // return studentRepository.findAll();
    // }

    // public Optional<Student> getStudentById(Long id) {
    // return studentRepository.findById(id);
    // }

    public Student createStudent(StudentRequestDto studentDto) {
        Long schoolId = studentDto.getSchoolId();
        School school = schoolRepository.findById(schoolId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid school ID: " + schoolId));

        studentDto.setSchool(school); // Set the fetched school in the student entity
        return studentRepository.save(StudentMapper.mapToStudent(studentDto));
    }

    // public void deleteStudent(Long id) {
    // studentRepository.deleteById(id);
    // }

    // public boolean studentExists(Long id) {
    // return studentRepository.existsById(id);
    // }

}
