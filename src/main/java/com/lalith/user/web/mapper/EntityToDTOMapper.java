package com.lalith.user.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.lalith.user.domain.Address;
import com.lalith.user.domain.Experience;
import com.lalith.user.domain.Organization;
import com.lalith.user.domain.User;
import com.lalith.user.web.model.AddressDTO;
import com.lalith.user.web.model.ExperienceDTO;
import com.lalith.user.web.model.OrganizationDTO;
import com.lalith.user.web.model.UserDTO;

@Mapper
public interface EntityToDTOMapper
{
    List<Address> toAddress(List<AddressDTO> addressDTO);

    List<AddressDTO> toAddressDTO(List<Address> address);

    List<Organization> toOrganization(List<OrganizationDTO> organizationDTO);

    List<OrganizationDTO> toOrganizationDTO(List<Organization> organization);

    List<Experience> toExperience(List<ExperienceDTO> experienceDTO);

    List<ExperienceDTO> toExperienceDTO(List<Experience> experience);

    List<User> toUser(List<UserDTO> userDTO);

    List<UserDTO> toUserDTO(List<User> user);

    Address toAddress(AddressDTO addressDTO);

    AddressDTO toAddressDTO(Address address);

    Organization toOrganization(OrganizationDTO organizationDTO);

    OrganizationDTO toOrganizationDTO(Organization organization);

    Experience toExperience(ExperienceDTO experienceDTO);

    ExperienceDTO toExperienceDTO(Experience experience);

    User toUser(UserDTO userDTO);

    UserDTO toUserDTO(User user);
}
