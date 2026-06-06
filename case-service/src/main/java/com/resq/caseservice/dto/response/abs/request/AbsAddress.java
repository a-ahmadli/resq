package com.resq.caseservice.dto.response.abs.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AbsAddress {
  private String classId;
  private String countryCode;
  private String city;
  private String street;
  private String streetNumber;
  private String type;
  private String postCode;
}
