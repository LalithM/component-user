package com.lalith.user.web.model;

import java.util.UUID;

import com.lalith.user.domain.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class OrganizationDTO extends BaseEntity
{
    private UUID orgId;

    private String name;

    private String location;

    private long totalEmployees;

    private AddressDTO address;

    private Long noticePeriod;
}
