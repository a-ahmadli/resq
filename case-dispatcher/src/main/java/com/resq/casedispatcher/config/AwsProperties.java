package com.resq.casedispatcher.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "aws")
public class AwsProperties {
  private String region;
  private Sqs sqs;
  private DynamoDb dynamoDb;
  private Sns sns;

  @Data
  public static class Sqs {
    private String queueUrl;
  }

  @Data
  public static class DynamoDb {
    private String tableName;
  }

  @Data
  public static class Sns {
    private String topicArn;
  }
}
