package com.dncoyote.minerva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dncoyote.minerva.dto.SchoolRequestDto;
import com.dncoyote.minerva.entity.School;
import com.dncoyote.minerva.service.SchoolService;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    // @GetMapping
    // public List<School> getAllSchools() {
    //     return schoolService.getAllSchools();
    // }

    @PostMapping
    public ResponseEntity<School> createSchool(@RequestBody SchoolRequestDto schooldto) {
        School savedSchool = schoolService.createSchool(schooldto);
        return new ResponseEntity<>(savedSchool, HttpStatus.CREATED);
    }

    // // Update an existing school
    // @PutMapping("/{id}")
    // public ResponseEntity<School> updateschool(@PathVariable Long id, @RequestBody School updatedSchool) {
    //     Optional<School> existingSchool = schoolService.getSchoolById(id);

    //     if (existingSchool.isPresent()) {
    //         updatedSchool.setId(id);
    //         School savedSchool = schoolService.saveSchool(updatedSchool);
    //         return ResponseEntity.ok(savedSchool);
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }

    // // Delete a school by ID
    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteschool(@PathVariable Long id) {
    //     if (schoolService.schoolExists(id)) {
    //         schoolService.deleteSchool(id);
    //         return ResponseEntity.noContent().build();
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }

}
