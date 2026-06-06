package com.resq.caseservice.dto.response.abs.request;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AbsExtEntity {
  private String classId;
  private String externalCustomerContractNumber;
  private List<AbsParty> parties;
  private List<AbsProperty> properties;
  private List<AbsEntry> entries;
  private String applicationChannel;
  private AbsInterval externalContractInterval;
  private Boolean hasTrailer;
  private Boolean isSensitive;
  private Boolean coverageCheckStatus;
  private Boolean beneficiarySearch;
}
