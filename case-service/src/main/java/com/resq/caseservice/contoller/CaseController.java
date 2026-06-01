package com.resq.caseservice.contoller;

import static com.resq.caseservice.constants.ApiConstants.BASE_URL;

import com.resq.caseservice.dto.request.CreateCaseRequest;
import com.resq.caseservice.dto.response.AsyncCaseResponse;
import com.resq.caseservice.dto.response.CreateCaseResponse;
import com.resq.caseservice.service.CaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(BASE_URL)
@RequiredArgsConstructor
public class CaseController {

  private final CaseService caseService;

  private static final String POST_CASE = "/cases";
  private static final String POST_CASE_ASYNC = "/async-cases";

  @PostMapping(POST_CASE)
  public ResponseEntity<CreateCaseResponse> createCase(@RequestBody CreateCaseRequest request) {
    return ResponseEntity.status(HttpStatus.CREATED).body(caseService.createCase(request));
  }

  @PostMapping(POST_CASE_ASYNC)
  public ResponseEntity<AsyncCaseResponse> createCaseAsync(@RequestBody CreateCaseRequest request) {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(caseService.createCaseAsync(request));
  }
}
