package com.resq.caseservice.dto.response.abs.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AbsCaseRequest {
  private String classId;
  private String contractNumber;
  private String caseCause;
  private String caseType;
  private String caseCategory;
  private List<String> subCaseCauses;
  private String externalCaseReference;
  private String description;
  private String additionalCaseRemarks;
  private AbsExtEntity extEntity;

  @JsonProperty("caselocation")
  private AbsCaseLocation caseLocation;
}
