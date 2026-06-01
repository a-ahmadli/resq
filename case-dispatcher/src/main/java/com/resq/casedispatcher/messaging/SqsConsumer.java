package com.resq.casedispatcher.messaging;

import com.resq.casedispatcher.config.AwsProperties;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.DeleteMessageRequest;
import software.amazon.awssdk.services.sqs.model.Message;
import software.amazon.awssdk.services.sqs.model.ReceiveMessageRequest;

@Component
@Slf4j
@RequiredArgsConstructor
public class SqsConsumer {
  private final SqsClient sqsClient;
  private final AwsProperties awsProperties;
  private final SnsPublisher snsPublisher;

  @Scheduled(fixedDelay = 5000)
  public void consumer() {
    log.info("Polling SQS...");
    List<Message> messages =
        sqsClient
            .receiveMessage(
                ReceiveMessageRequest.builder()
                    .queueUrl(awsProperties.getSqs().getQueueUrl())
                    .maxNumberOfMessages(10)
                    .messageAttributeNames("All")
                    .waitTimeSeconds(10)
                    .build())
            .messages();

    messages.forEach(
        m -> {
          String requestId =
              m.messageAttributes().containsKey("requestId")
                  ? m.messageAttributes().get("requestId").stringValue()
                  : "unknown";
          log.info("Received requestId: {}, body: {}", requestId, m.body());
          snsPublisher.publishToSns(m.body(), requestId);

          sqsClient.deleteMessage(
              DeleteMessageRequest.builder()
                  .queueUrl(awsProperties.getSqs().getQueueUrl())
                  .receiptHandle(m.receiptHandle())
                  .build());
        });
  }
}
