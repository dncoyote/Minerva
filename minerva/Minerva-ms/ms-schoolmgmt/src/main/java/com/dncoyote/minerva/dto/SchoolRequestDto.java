package com.dncoyote.minerva.dto;

import com.dncoyote.minerva.entity.School;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SchoolRequestDto {
    private Long schoolId;
    private String name;
}
