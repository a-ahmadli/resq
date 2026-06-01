package com.resq.caseservice.dto.request;

import com.resq.caseservice.constants.enums.ApplicationChannel;
import com.resq.caseservice.constants.enums.CaseDescription;
import com.resq.caseservice.domain.Incident;
import com.resq.caseservice.domain.InvolvedCompanies;
import com.resq.caseservice.domain.InvolvedPerson;
import com.resq.caseservice.domain.Vehicle;
import java.util.List;
import lombok.Data;

@Data
public class CreateCaseRequest {
  private String azCorporateContractNumber;
  private String bpCaseNumber;
  private CaseDescription caseDescription;
  private String comment;
  private Incident incident;
  private String customerContractNumber;
  private Boolean isPriority;
  private Boolean beneficiarySearch;
  private String additionalCaseRemarks;
  private List<InvolvedCompanies> involvedCompanies;
  private List<InvolvedPerson> involvedPersons;
  private List<Vehicle> vehicles;
  private ApplicationChannel applicationChannel;
}
