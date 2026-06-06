package com.resq.caseservice.dto.response.abs.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AbsCharacteristics {
  private String classId;
  private String vehicleBrand;
  private String vehicleModel;
  private String fuelType;
  private String transmissionType;
  private String vehicleColor;
}
