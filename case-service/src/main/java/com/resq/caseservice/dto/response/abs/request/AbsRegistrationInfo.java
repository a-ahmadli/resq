package com.resq.caseservice.dto.response.abs.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AbsRegistrationInfo {
    private String classId;
    private AbsAddress registrationOfficeAddress;
    private String firstRegistrationDate;
}
