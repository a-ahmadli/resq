package com.resq.caseservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCaseResponse {
  private String caseId;
  private String azCaseNumber;
}
