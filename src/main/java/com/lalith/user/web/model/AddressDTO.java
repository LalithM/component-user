package com.lalith.user.web.model;

import java.util.UUID;

import com.lalith.user.domain.AddressType;
import com.lalith.user.domain.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AddressDTO extends BaseEntity
{
    private UUID addressId;

    private String addressLine1;

    private String addressLine2;

    private String addressLine3;

    private String country;

    private String state;

    private String city;

    private Long pinCode;

    private AddressType addressType;

    private UserDTO user;

    private OrganizationDTO organization;
}
