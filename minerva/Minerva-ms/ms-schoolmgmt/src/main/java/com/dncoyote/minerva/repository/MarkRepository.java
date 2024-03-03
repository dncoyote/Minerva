package com.dncoyote.minerva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dncoyote.minerva.entity.Mark;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {

    @Query("SELECT m FROM Mark m INNER JOIN m.student s WHERE s.school.schoolId = :schoolId AND m.subject = :subject ORDER BY m.score DESC LIMIT 1")
    Mark findMaxMarkBySchoolIdAndSubject(@Param("schoolId") Long schoolId, @Param("subject") String subject);
}
