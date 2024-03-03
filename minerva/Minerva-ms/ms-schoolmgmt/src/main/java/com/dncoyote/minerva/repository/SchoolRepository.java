package com.dncoyote.minerva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dncoyote.minerva.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
