package com.lalith.user.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "ADDRESS")
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID")
    private UUID addressId;

    @NotNull
    @Column(name = "ADDRESS_LINE1")
    private String addressLine1;

    @Column(name = "ADDRESS_LINE2")
    private String addressLine2;

    @Column(name = "ADDRESS_LINE3")
    private String addressLine3;

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
    @Column(name = "PINCODE")
    private Long pinCode;

    @NotNull
    @Column(name = "ADDRESS_TYPE")
    private AddressType addressType;

    @OneToOne
    @MapsId
    @JoinColumn(name = "USER_NAME")
    private User user;

    @OneToOne
    @MapsId
    @JoinColumn(name = "ORG_NAME")
    private Organization organization;
}
