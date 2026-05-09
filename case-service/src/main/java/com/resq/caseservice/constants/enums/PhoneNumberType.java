package com.resq.caseservice.constants.enums;

import static com.resq.caseservice.utils.EnumUtil.parseByToString;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneNumberType {
  LANDLINE("Landline"),
  MOBILE("Mobile"),
  UNDETERMINED_VALUE;

  private final String value;

  PhoneNumberType() {
    this.value = this.name();
  }

  @Override
  public String toString() {
    return value;
  }

  public static PhoneNumberType parseToString(String source) {
    return parseByToString(PhoneNumberType.class, source, UNDETERMINED_VALUE);
  }
}
