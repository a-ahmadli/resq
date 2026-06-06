package com.resq.caseservice.dto.response.abs.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AbsProperty {
  private String classId;
  private String propertyType;
  private String licensePlateNumber;
  private String vehicleIdentificationNumber;
  private AbsCharacteristics characteristics;
  private AbsPropertyExtEntity extEntity;
  private List<AbsAccessory> accessories;
  private AbsRegistrationInfo registrationInformation;
  private AbsMileageRecord mileageRecord;
}
