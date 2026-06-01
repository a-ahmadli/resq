package com.resq.caseservice.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AsyncCaseResponse {
  private String requestId;
}
