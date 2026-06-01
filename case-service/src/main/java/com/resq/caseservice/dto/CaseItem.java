package com.resq.caseservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaseItem {
  private String caseId;
  private String status;
  private String contractNumber;
  private Boolean isPriority;
  private String createdAt;
}
