package com.dncoyote.minerva.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dncoyote.minerva.dto.SchoolRequestDto;
import com.dncoyote.minerva.entity.School;
import com.dncoyote.minerva.mapper.SchoolMapper;
import com.dncoyote.minerva.repository.SchoolRepository;
import com.dncoyote.minerva.service.SchoolService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    // public List<School> getAllSchools() {
    // return schoolRepository.findAll();
    // }

    // public Optional<School> getSchoolById(Long id) {
    // return schoolRepository.findById(id);
    // }

    public School createSchool(SchoolRequestDto schooldto) {
        School school = SchoolMapper.mapToSchool(schooldto);
        return schoolRepository.save(school);
    }

    // public void deleteSchool(Long id) {
    // schoolRepository.deleteById(id);
    // }

    // public boolean schoolExists(Long id) {
    // return schoolRepository.existsById(id);
    // }
}
