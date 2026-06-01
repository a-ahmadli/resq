package com.resq.caseservice.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.resq.caseservice.constants.enums.CaseStatus;
import com.resq.caseservice.dto.CaseItem;
import com.resq.caseservice.dto.request.CreateCaseRequest;
import com.resq.caseservice.dto.response.AsyncCaseResponse;
import com.resq.caseservice.dto.response.CreateCaseResponse;
import com.resq.caseservice.messaging.SqsPublisher;
import com.resq.caseservice.repository.CaseRepository;
import com.resq.caseservice.service.CaseService;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CaseServiceImpl implements CaseService {

  private final CaseRepository caseRepository;
  private final SqsPublisher sqsPublisher;
  private final ObjectMapper objectMapper;

  @Override
  public CreateCaseResponse createCase(CreateCaseRequest request) {
    String caseId = UUID.randomUUID().toString();
    caseRepository.save(
        CaseItem.builder()
            .caseId(caseId)
            .status("CREATED")
            .contractNumber(request.getAzCorporateContractNumber())
            .isPriority(request.getIsPriority())
            .createdAt(LocalDateTime.now().toString())
            .build());
    return CreateCaseResponse.builder()
        .caseId(caseId)
        .azCaseNumber("PENDING") // TODO we will use mock service here instead of calling real ABS
        .build();
  }

  @Override
  public AsyncCaseResponse createCaseAsync(CreateCaseRequest request) {
    String requestId = UUID.randomUUID().toString();
    try {
      String json = objectMapper.writeValueAsString(request);
      caseRepository.save(CaseItem.builder()
              .caseId(requestId)
              .status(CaseStatus.PENDING_DISPATCH.name())
              .contractNumber(request.getAzCorporateContractNumber())
              .isPriority(request.getIsPriority())
              .createdAt(Instant.now().toString())
              .build());
      sqsPublisher.publishToSqs(requestId, json);
    } catch (JsonProcessingException e) {
      throw new RuntimeException("Failed to serialize request", e);
    }
    return AsyncCaseResponse.builder().requestId(requestId).build();
  }
}
