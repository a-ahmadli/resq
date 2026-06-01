package com.resq.caseservice.repository;

import com.resq.caseservice.dto.CaseItem;
import java.util.Optional;

public interface CaseRepository {
  void save(CaseItem caseItem);

  Optional<String> findById(String caseId);
}
