package com.resq.caseservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AdditionalInfo {
  private String categorization;
  private Boolean isCompanyOwnership;
  private Boolean isDigitalKeyUsage;
  private Integer avgDistanceTravelledPerWeekInKm;
  private Integer engineOilLevelPercentage;
  private Integer batteryConditionPercentage;
  private Integer batteryHealthPercentage;
  private Integer coolerTemperatureInCelsius;
  private Integer outsideTemperatureInCelsius;
  private Integer tankFillInLiter;
  private Integer stateOfChargePercentage;
  private Boolean hasBikeRack;
  private String breakdownNote;
  private Boolean vip;
  private Boolean gkl;
  private TirePressure tirePressure;
}
