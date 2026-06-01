package com.resq.caseservice.domain;

import lombok.Data;

@Data
public class InvolvedCompanies {
  private String companyId;

  InvolvedCompanies() {}

  InvolvedCompanies(String companyId) {
    this.companyId = companyId;
  }

  public static class InvolvedCompaniesBuilder {
    private String companyId;

    public InvolvedCompaniesBuilder companyId(String companyId) {
      this.companyId = companyId;
      return this;
    }

    public InvolvedCompanies build() {
      return new InvolvedCompanies(companyId);
    }
  }

  public InvolvedCompaniesBuilder builder() {
    return new InvolvedCompaniesBuilder();
  }
}
