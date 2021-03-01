package com.lalith.user.web.model;

import java.time.LocalDate;
import java.util.UUID;

import com.lalith.user.domain.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ExperienceDTO extends BaseEntity
{
    private UUID id;

    private String organization;

    private Double years;

    private LocalDate joiningDate;

    private String role;

    private Boolean isCurrentEmployer;

    private UserDTO user;

    private LocalDate endDate;
}
