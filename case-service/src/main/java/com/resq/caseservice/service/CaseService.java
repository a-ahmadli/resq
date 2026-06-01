package com.resq.caseservice.service;

import com.resq.caseservice.dto.request.CreateCaseRequest;
import com.resq.caseservice.dto.response.AsyncCaseResponse;
import com.resq.caseservice.dto.response.CreateCaseResponse;

public interface CaseService {
  CreateCaseResponse createCase(CreateCaseRequest request);

  AsyncCaseResponse createCaseAsync(CreateCaseRequest request);
}
