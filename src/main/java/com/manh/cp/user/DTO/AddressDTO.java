package com.manh.cp.user.DTO;

import java.util.UUID;

import com.lalith.user.model.AddressType;

public class AddressDTO
{
    private UUID addressId;

    private String address;

    private String address1;

    private String address2;

    private String country;

    private String state;

    private String city;

    private Long zipCode;

    private AddressType addressType;

    private UserDTO user;

    private OrganizationDTO organizationDTO;
}
