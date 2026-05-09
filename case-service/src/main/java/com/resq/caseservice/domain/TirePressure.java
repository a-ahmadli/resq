package com.resq.caseservice.domain;

import lombok.Data;

@Data
public class TirePressure {
  private Double frontRightInBar;
  private Double frontLeftInBar;
  private Double rearRightInBar;
  private Double rearLeftInBar;

  TirePressure() {}

  TirePressure(
      Double frontRightInBar, Double frontLeftInBar, Double rearRightInBar, Double rearLeftInBar) {
    this.frontRightInBar = frontRightInBar;
    this.frontLeftInBar = frontLeftInBar;
    this.rearRightInBar = rearRightInBar;
    this.rearLeftInBar = rearLeftInBar;
  }

  public static class TirePressureBuilder {
    private Double frontRightInBar;
    private Double frontLeftInBar;
    private Double rearRightInBar;
    private Double rearLeftInBar;

    public TirePressureBuilder frontRightInBar(Double frontRightInBar) {
      this.frontRightInBar = frontRightInBar;
      return this;
    }

    public TirePressureBuilder frontLeftInBar(Double frontLeftInBar) {
      this.frontLeftInBar = frontLeftInBar;
      return this;
    }

    public TirePressureBuilder rearRightInBar(Double rearRightInBar) {
      this.rearRightInBar = rearRightInBar;
      return this;
    }

    public TirePressureBuilder rearLeftInBar(Double rearLeftInBar) {
      this.rearLeftInBar = rearLeftInBar;
      return this;
    }

    public TirePressure build() {
      return new TirePressure(frontRightInBar, frontLeftInBar, rearRightInBar, rearLeftInBar);
    }
  }

  public static TirePressureBuilder builder() {
    return new TirePressureBuilder();
  }
}
