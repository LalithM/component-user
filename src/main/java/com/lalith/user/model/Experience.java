package com.lalith.user.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import lombok.Data;

@Data
@Entity(name = "EXPERIENCE")
public class Experience
{
    @Id
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORGANIZATION_ID", referencedColumnName = "ORGANIZATION_ID")
    private Organization organization;

    @Column(name = "EXP_YEARS")
    private Double years;

    @Past
    @Column(name = "JOINING_DATE")
    private LocalDate joiningDate;

    @NotNull
    @Column(name = "ROLE")
    private String role;

    @Column(name = "IS_CURRENT_EMPLOYER")
    private Boolean isCurrentEmployer;

    @ManyToOne
    @JoinColumn(name = "USER_NAME", nullable = false)
    private User user;
}
