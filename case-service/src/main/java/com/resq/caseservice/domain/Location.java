package com.resq.caseservice.domain;

import com.resq.caseservice.constants.enums.LocationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {
  private LocationType locationType;
  private String countryCode;
  private String city;
  private String street;
  private String streetNumber;
  private String postCode;
  private String latitude;
  private String longitude;
}
