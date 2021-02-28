package com.manh.cp.user.DTO;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.lalith.user.model.BaseEntity;
import com.lalith.user.model.UserType;

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

    private List<AddressDTO> addressDTOS;

    private UserType userType;

    private List<ExperienceDTO> experiences;
}
