package com.resq.caseservice.domain;

import com.resq.caseservice.constants.enums.VehicleType;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {
  private VehicleType vehicleType;
  private String vehicleBrand;
  private String vehicleModel;
  private String licensePlateNumber;
  private String vehicleIdentificationNumber;
  private LocalDate productionDate;
  private Integer mileageKmAtIncident;
  private String diagnosticTroubleCode;
  private String vehicleTransmissionType;
  private String vehicleFuelType;
  private String vehicleColor;
  private Integer numberOfPassengers;
  private Integer involvedChildren;
  private Boolean hasCustomerLuggage;
  private Boolean hasRoofBox;
  private Boolean hasTrailer;
  private Boolean isImmobile;
  private Integer customerPets;
  private String licensePlateCountry;
  private AdditionalInfo additionalInfo;
  private Coverage coverage;
}
