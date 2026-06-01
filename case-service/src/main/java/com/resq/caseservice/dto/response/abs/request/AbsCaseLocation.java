package com.resq.caseservice.dto.response.abs.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbsCaseLocation {
private String classId;
private String countryCode;
private String city;
private String street;
private String postCode;
private String streetNumber;
private AbsGeoLocation geoLocation;
private AbsLocationExtEntity extEntity;
private String description;
private String doorNumber;
}
