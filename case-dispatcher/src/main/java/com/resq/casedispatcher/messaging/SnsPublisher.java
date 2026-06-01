package com.resq.casedispatcher.messaging;

import static com.resq.casedispatcher.constants.CaseConstant.CASE_MESSAGE;

import com.resq.casedispatcher.config.AwsProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.MessageAttributeValue;
import software.amazon.awssdk.services.sns.model.PublishRequest;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class SnsPublisher {

  private final AwsProperties awsProperties;
  private final SnsClient snsClient;

  public void publishToSns(String message, String requestId) {
    snsClient.publish(PublishRequest.builder()
            .message(message)
                    .subject(CASE_MESSAGE)
                    .messageAttributes(Map.of(
                            "requestId",
                            MessageAttributeValue.builder()
                                    .dataType("String")
                                    .stringValue(requestId).build()
                    )).topicArn(awsProperties.getSns().getTopicArn())
            .build());
  }
}
