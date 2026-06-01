package com.resq.caseservice.dto.response.abs.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AbsEntry {
    private String classId;
    private String description;
    private Object value;
}
