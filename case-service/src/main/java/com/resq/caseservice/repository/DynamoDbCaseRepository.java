package com.resq.caseservice.repository;

import static com.resq.caseservice.constants.CaseTableConstants.CASE_ID;
import static com.resq.caseservice.constants.CaseTableConstants.CONTRACT_NUMBER;
import static com.resq.caseservice.constants.CaseTableConstants.CREATED_AT;
import static com.resq.caseservice.constants.CaseTableConstants.IS_PRIORITY;
import static com.resq.caseservice.constants.CaseTableConstants.STATUS;

import com.resq.caseservice.config.AwsProperties;
import com.resq.caseservice.dto.CaseItem;
import java.util.Map;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

@Repository
@RequiredArgsConstructor
public class DynamoDbCaseRepository implements CaseRepository {

  private final DynamoDbClient dynamoDbClient;
  private final AwsProperties awsProperties;

  @Override
  public void save(CaseItem caseItem) {
    dynamoDbClient.putItem(
        PutItemRequest.builder()
            .tableName(awsProperties.getDynamodb().getTableName())
            .item(
                Map.of(
                    CASE_ID, AttributeValue.builder().s(caseItem.getCaseId()).build(),
                    STATUS, AttributeValue.builder().s(caseItem.getStatus()).build(),
                    CONTRACT_NUMBER,
                        AttributeValue.builder().s(caseItem.getContractNumber()).build(),
                    IS_PRIORITY, AttributeValue.builder().bool(caseItem.getIsPriority()).build(),
                    CREATED_AT, AttributeValue.builder().s(caseItem.getCreatedAt()).build()))
            .build());
  }

  @Override
  public Optional<String> findById(String caseId) {
    return Optional.empty();
  }
}
