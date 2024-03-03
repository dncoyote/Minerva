package com.dncoyote.minerva.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dncoyote.minerva.dto.MarkRequestDto;
import com.dncoyote.minerva.entity.Mark;
import com.dncoyote.minerva.entity.Student;
import com.dncoyote.minerva.mapper.MarkMapper;
import com.dncoyote.minerva.repository.MarkRepository;
import com.dncoyote.minerva.repository.StudentRepository;
import com.dncoyote.minerva.service.MarkService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MarkServiceImpl implements MarkService {

    @Autowired
    private MarkRepository markRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private EntityManager entityManager;

    public Mark createMark(MarkRequestDto markdto) {
        Long studentId = markdto.getStudentId();
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Student ID: " + studentId));

        markdto.setStudent(student);
        return markRepository.save(MarkMapper.mapToMark(markdto));
    }

    public Mark getMaxMarkBySchoolAndSubject(Long schoolId, String subject) {
        return markRepository.findMaxMarkBySchoolIdAndSubject(schoolId, subject);
    }

    public Mark getMaxMarkBySchoolAndSubject1(Long schoolId, String subject) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Mark> criteriaQuery = criteriaBuilder.createQuery(Mark.class);
        Root<Mark> root = criteriaQuery.from(Mark.class);

        criteriaQuery.select(root);
        criteriaQuery.where(
                criteriaBuilder.equal(root.get("student").get("school").get("schoolId"), schoolId),
                criteriaBuilder.equal(root.get("subject"), subject));
        criteriaQuery.orderBy(criteriaBuilder.desc(root.get("score")));

        List<Mark> resultList = entityManager.createQuery(criteriaQuery)
                .setMaxResults(1)
                .getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }

}
