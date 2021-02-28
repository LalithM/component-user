package com.lalith.user.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "ORGANIZATION")
@EqualsAndHashCode(callSuper=false)
public class Organization extends BaseEntity
{
    @Id
    @Column(name = "ORGANIZATION_ID")
    private UUID orgId;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @NotNull
    @Column(name = "LOCATION")
    private String location;

    @Size(min = 1)
    @Column(name = "TOTAL_EMPLOYESS")
    private long totalEmployees;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID")
    private Address address;

    @Size(min = 1)
    @NotNull
    @Column(name = "NOTICE_PERIOD")
    private Long noticePeriod;

    @OneToOne(mappedBy = "organization")
    private Experience experience;

}
