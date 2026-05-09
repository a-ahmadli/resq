package com.resq.caseservice.domain;

import com.resq.caseservice.constants.enums.CoverageCheckStatus;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Coverage {
  private CoverageCheckStatus coverageCheckStatus;
  private OffsetDateTime startDateTime;
  private OffsetDateTime endDateTime;
}
