package com.resq.caseservice.domain;

import com.resq.caseservice.constants.enums.AddressType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
  private AddressType addressType;
  private String countryCode;
  private String city;
  private String street;
  private String streetNumber;
  private String postCode;
}
