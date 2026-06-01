package com.resq.caseservice.messaging;

import com.resq.caseservice.config.AwsProperties;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.MessageAttributeValue;
import software.amazon.awssdk.services.sqs.model.SendMessageRequest;

@Component
@Slf4j
@RequiredArgsConstructor
public class SqsPublisher {

  private final SqsClient sqsClient;
  private final AwsProperties awsProperties;

  public void publishToSqs(String requestId, String message) {
    log.info("Publish message to SQS");
    sqsClient.sendMessage(
        SendMessageRequest.builder()
            .queueUrl(awsProperties.getSqs().getQueueUrl())
            .messageBody(message)
            .messageAttributes(
                Map.of(
                    "requestId",
                    MessageAttributeValue.builder()
                        .dataType("String")
                        .stringValue(requestId)
                        .build()))
            .build());
  }
}
