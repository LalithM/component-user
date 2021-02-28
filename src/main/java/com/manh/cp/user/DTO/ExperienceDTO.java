package com.manh.cp.user.DTO;

import java.time.LocalDate;
import java.util.UUID;

public class ExperienceDTO
{
    private UUID id;

    private OrganizationDTO organizationDTO;

    private Double years;

    private LocalDate joiningDate;

    private String role;

    private Boolean isCurrentEmployer;

    private UserDTO user;
}
