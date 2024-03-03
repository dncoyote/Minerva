package com.dncoyote.minerva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dncoyote.minerva.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
