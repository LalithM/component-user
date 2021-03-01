package com.lalith.user.web.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.lalith.user.domain.BaseEntity;
import com.lalith.user.domain.UserType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserDTO extends BaseEntity
{
    private UUID userId;

    private String userName;

    private String firstName;

    private String lastName;

    private String fullName;

    private String emailId;

    private Long phoneNumber;

    private LocalDate dateOfBirth;

    private Boolean servingNotice;

    private Long daysOfNotice;

    private AddressDTO address;

    private UserType userType;

    private List<ExperienceDTO> experiences;
}
