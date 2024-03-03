package com.dncoyote.minerva.service;

import com.dncoyote.minerva.dto.MarkRequestDto;
import com.dncoyote.minerva.entity.Mark;

public interface MarkService {
    public Mark createMark(MarkRequestDto markdto);

    public Mark getMaxMarkBySchoolAndSubject(Long schoolId, String subject);
}
