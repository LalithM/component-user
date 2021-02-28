package com.lalith.user.model;

public enum UserType
{
    EMPLOYEE("Employee"),
    EMPLOYER("Employer"),
    ADMIN("Admin"),
    MODERATOR("Moderator");

    private final String userType;

    UserType(String userType)
    {
        this.userType = userType;
    }
}
