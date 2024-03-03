package com.dncoyote.minerva.mapper;

import com.dncoyote.minerva.dto.MarkRequestDto;
import com.dncoyote.minerva.entity.Mark;

public class MarkMapper {
    public static MarkRequestDto mapToMarkDto(Mark mark) {
        return new MarkRequestDto(mark.getId(), mark.getScore(), mark.getSubject(),
                mark.getStudent().getStudentId(), mark.getStudent());
    }

    public static Mark mapToMark(MarkRequestDto markDto) {
        return new Mark(markDto.getId(), markDto.getScore(), markDto.getSubject(), markDto.getStudent());
    }
}
