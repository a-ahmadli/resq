package com.resq.caseservice.constants.enums;

import static com.resq.caseservice.utils.EnumUtil.parseByToString;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderIdentity {
  MALE("Male"),
  FEMALE("Female"),
  OTHER("Other"),
  UNDETERMINED_VALUE;

  private final String value;

  GenderIdentity() {
    this.value = this.name();
  }

  @Override
  public String toString() {
    return value;
  }

  public static GenderIdentity parseToString(String source) {
    return parseByToString(GenderIdentity.class, source, UNDETERMINED_VALUE);
  }
}
