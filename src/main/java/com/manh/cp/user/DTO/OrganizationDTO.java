package com.manh.cp.user.DTO;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.lalith.user.model.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

public class OrganizationDTO extends BaseEntity
{
    private UUID orgId;

    private String name;

    private String location;

    private long totalEmployees;

    private AddressDTO addressDTO;

    private Long noticePeriod;

    private ExperienceDTO experience;

}
