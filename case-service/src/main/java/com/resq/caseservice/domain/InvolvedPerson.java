package com.resq.caseservice.domain;

import com.resq.caseservice.constants.enums.GenderIdentity;
import com.resq.caseservice.constants.enums.PersonRole;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InvolvedPerson {
  private List<PersonRole> roles;
  private String firstName;
  private String lastName;
  private String customerLanguage;
  private GenderIdentity genderIdentity;
  private List<Email> emails;
  private List<PhoneNumber> phoneNumbers;
  private List<Address> addresses;
}
