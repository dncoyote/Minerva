package com.dncoyote.minerva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dncoyote.minerva.dto.MarkRequestDto;
import com.dncoyote.minerva.entity.Mark;
import com.dncoyote.minerva.service.MarkService;

@RestController
@RequestMapping("/api/mark")
public class MarkController {
    @Autowired
    private MarkService markService;

    @PostMapping
    public ResponseEntity<Mark> createMark(@RequestBody MarkRequestDto markdto) {
        Mark savedMark = markService.createMark(markdto);
        return new ResponseEntity<>(savedMark, HttpStatus.CREATED);
    }

    @GetMapping("/max")
    public ResponseEntity<Mark> getMaxMark(@RequestParam Long schoolId, @RequestParam String subject) {
        Mark maxMark = markService.getMaxMarkBySchoolAndSubject(schoolId, subject);
        return ResponseEntity.ok(maxMark);
    }
}
