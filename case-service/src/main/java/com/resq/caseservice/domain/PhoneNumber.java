package com.resq.caseservice.domain;

import com.resq.caseservice.constants.enums.PhoneNumberType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhoneNumber {
  private String phoneNumber;
  private PhoneNumberType phoneNumberType;
}
