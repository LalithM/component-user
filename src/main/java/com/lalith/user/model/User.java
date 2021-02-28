package com.lalith.user.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "USER")
@EqualsAndHashCode(callSuper=false)
public class User extends BaseEntity
{
    @Id
    private UUID userId;

    @Column(name = "USER_NAME",unique = true,length = 500)
    private String userName;

    @Min(value = 3)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Min(value = 1)
    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Email
    @Column(name = "EMAIL_ID",unique = true,length = 500)
    private String emailId;

    @Size(min = 10)
    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber;

    @Past
    @Column(name = "DOB")
    private LocalDate dateOfBirth;

    @NotNull
    @Column(name = "ON_NOTICE")
    private Boolean servingNotice;

    @Column(name = "NOTICE_PERIOD")
    private Long daysOfNotice;

    @OneToMany(mappedBy="user")
    private List<Address> address;

    @NotNull
    @Column(name = "USER_TYPE")
    private UserType userType;

    @OneToMany(mappedBy="user")
    private List<Experience> experiences;
}
