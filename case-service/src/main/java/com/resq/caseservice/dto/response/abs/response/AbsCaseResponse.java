package com.resq.caseservice.dto.response.abs.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AbsCaseResponse {
  private String self;
  private String caseNumber;
}
