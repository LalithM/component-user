package com.lalith.user.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "ADDRESS")
public class Address
{
    @Id
    @Column(name = "ADDRESS_ID")
    private UUID addressId;

    @NotNull
    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ADDRESS_1")
    private String address1;

    @Column(name = "ADDRESS_2")
    private String address2;

    @NotNull
    @Column(name = "COUNTRY")
    private String country;

    @NotNull
    @Column(name = "STATE")
    private String state;

    @NotNull
    @Column(name = "CITY")
    private String city;

    @NotNull
    @Column(name = "ZIPCODE")
    private Long zipCode;

    @NotNull
    @Column(name = "ADDRESS_TYPE")
    private AddressType addressType;

    @ManyToOne
    @JoinColumn(name = "USER_NAME", nullable = false)
    private User user;

    @OneToOne(mappedBy = "address")
    private Organization organization;
}
