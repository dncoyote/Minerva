package com.dncoyote.minerva.service;

import com.dncoyote.minerva.dto.SchoolRequestDto;
import com.dncoyote.minerva.entity.School;

public interface SchoolService {
    public School createSchool(SchoolRequestDto schooldto);
}
