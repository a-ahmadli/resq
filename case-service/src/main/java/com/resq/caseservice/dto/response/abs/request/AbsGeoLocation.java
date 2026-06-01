package com.resq.caseservice.dto.response.abs.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AbsGeoLocation {
    private String classId;
    private String latitude;
    private String longitude;
    private String precisionRange;
}
