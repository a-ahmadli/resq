package com.resq.caseservice.dto.response.abs.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AbsParty {
    private String classId;
    private List<AbsAddress> addresses;
    private List<AbsContactChannel> preferredContactChannels;
    private List<AbsRole> roles;
    private String firstName;
    private String name;
    private String genderIdentity;
    private String language;
    private String self;
}
