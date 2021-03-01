package com.lalith.user.web.service;

import java.util.List;
import java.util.UUID;

import com.lalith.user.domain.User;
import com.lalith.user.web.model.UserDTO;

public interface UserService
{
    User findByUserId(UUID userId);

    List<User> findAllUsers();

    User save(UserDTO user);

    List<User> saveAll(List<UserDTO> userDTOList);

    User update(UserDTO user);

    void delete(UUID userId);

}
