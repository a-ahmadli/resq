package com.resq.caseservice.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "absClient", url = "${abs.base-url}")
public class AbsClient {}
