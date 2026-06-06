package com.resq.caseservice.service.mapper;

import com.resq.caseservice.constants.enums.ApplicationChannel;
import com.resq.caseservice.constants.enums.GenderIdentity;
import com.resq.caseservice.constants.enums.LocationType;
import com.resq.caseservice.constants.enums.PersonRole;
import com.resq.caseservice.constants.enums.VehicleType;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EnumMapper {

  public static final Map<GenderIdentity, String> GENDER_MAP =
      Map.of(
          GenderIdentity.FEMALE, "W",
          GenderIdentity.MALE, "M",
          GenderIdentity.OTHER, "N");

  public static final Map<VehicleType, String> VEHICLE_TYPE_MAP =
      Map.of(
          VehicleType.VT1, "SV1",
          VehicleType.VT2, "SV2",
          VehicleType.VT3, "HV13",
          VehicleType.VT4, "CC000000",
          VehicleType.VT5, "KFZP50",
          VehicleType.VT6, "BUS",
          VehicleType.VT7, "KFZP30",
          VehicleType.VT8, "Tractor Unit");

  public static final Map<ApplicationChannel, String> APPLICATION_CHANNEL_MAP =
      Map.of(
          ApplicationChannel.AC1, "K",
          ApplicationChannel.AC2, "T",
          ApplicationChannel.AC3, "L",
          ApplicationChannel.AC4, "W",
          ApplicationChannel.AC5, "S");

  public static final Map<LocationType, String> LOCATION_TYPE_MAP =
      Map.of(
          LocationType.LT1, "DD",
          LocationType.LT2, "DI",
          LocationType.LT3, "HO",
          LocationType.LT4, "PG",
          LocationType.LT5, "HW",
          LocationType.LT6, "RI",
          LocationType.LT7, "NR",
          LocationType.LT8, "WO");

  public static final Map<PersonRole, String> ROLE_MAP =
      Map.of(
          PersonRole.IP, "VP",
          PersonRole.DR, "A38",
          PersonRole.CO, "A37",
          PersonRole.RS, "WKS",
          PersonRole.CP, "CP");
}
 // Additional fact: Map.of() - supports 10 entries max