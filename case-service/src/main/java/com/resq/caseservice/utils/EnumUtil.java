package com.resq.caseservice.utils;

import java.util.Arrays;
import java.util.Objects;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EnumUtil {
  public static <T extends Enum<T>> T parseByToString(
      Class<T> enumClass, String source, T defaultVale) {
    return Arrays.stream(enumClass.getEnumConstants())
        .filter(e -> Objects.equals(e.toString(), source))
        .findFirst()
        .orElse(defaultVale);
  }
}
