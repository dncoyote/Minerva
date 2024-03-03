package com.dncoyote.minerva.mapper;

import com.dncoyote.minerva.dto.SchoolRequestDto;
import com.dncoyote.minerva.entity.School;

public class SchoolMapper {
    public static SchoolRequestDto mapToSchoolDto(School school) {
        return new SchoolRequestDto(
                school.getSchoolId(), school.getName());
    }

    public static School mapToSchool(SchoolRequestDto schoolDto) {
        return new School(
                schoolDto.getSchoolId(), schoolDto.getName());
    }
}
