package com.dncoyote.minerva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dncoyote.minerva.dto.StudentRequestDto;
import com.dncoyote.minerva.entity.Student;
import com.dncoyote.minerva.service.StudentService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@AllArgsConstructor
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

   // @GetMapping
    // public List<Student> getAllStudents() {
    // return studentService.getAllStudents();
    // }

    // // Get a student by ID
    // @GetMapping("/{id}")
    // public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
    // Optional<Student> student = studentService.getStudentById(id);
    // return student.map(ResponseEntity::ok).orElseGet(() ->
    // ResponseEntity.notFound().build());
    // }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody StudentRequestDto studentDto) {
        Student savedStudent = studentService.createStudent(studentDto);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    // // Update an existing student
    // @PutMapping("/{id}")
    // public ResponseEntity<Student> updateStudent(@PathVariable Long id,
    // @RequestBody Student updatedStudent) {
    // Optional<Student> existingStudent = studentService.getStudentById(id);

    // if (existingStudent.isPresent()) {
    // updatedStudent.setId(id);
    // Student savedStudent = studentService.saveStudent(updatedStudent);
    // return ResponseEntity.ok(savedStudent);
    // } else {
    // return ResponseEntity.notFound().build();
    // }
    // }

    // // Delete a student by ID
    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
    // if (studentService.studentExists(id)) {
    // studentService.deleteStudent(id);
    // return ResponseEntity.noContent().build();
    // } else {
    // return ResponseEntity.notFound().build();
    // }
    // }

}
