package com.resq.caseservice.domain;

import lombok.Data;

@Data
public class Email {
  private String email;

  Email() {}

  Email(String email) {
    this.email = email;
  }

  public static class EmailBuilder {
    private String email;

    public EmailBuilder email(String email) {
      this.email = email;
      return this;
    }

    public Email build() {
      return new Email(email);
    }
  }

  public static EmailBuilder builder() {
    return new EmailBuilder();
  }
}
