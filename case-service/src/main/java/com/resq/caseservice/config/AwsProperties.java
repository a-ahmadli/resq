package com.resq.caseservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "aws")
public class AwsProperties {

  private String region;
  private DynamoDB dynamodb;
  private Sqs sqs;

  @Data
  public static class DynamoDB {
    private String tableName;
  }

  @Data
  public static class Sqs {
    private String queueUrl;
  }
}
