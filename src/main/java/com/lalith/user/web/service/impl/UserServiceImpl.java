package com.lalith.user.web.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lalith.user.domain.User;
import com.lalith.user.exception.NoDataFoundException;
import com.lalith.user.repository.UserRepository;
import com.lalith.user.web.mapper.EntityToDTOMapper;
import com.lalith.user.web.model.UserDTO;
import com.lalith.user.web.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    EntityToDTOMapper mapper;

    @Override
    public User findByUserId(UUID userId)
    {
        logger.debug(" --> findByUserId() for userId : {}", userId);
        return userRepository.findById(userId)
                .orElseThrow(() -> new NoDataFoundException("User not found for User Id " + userId));
    }

    @Override
    public List<User> findAllUsers()
    {
        logger.debug(" --> findAllUsers()");
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User save(UserDTO user)
    {
        logger.debug(" --> save() for User :{}", user);
        return userRepository.save(mapper.toUser(user));
    }

    @Override
    public List<User> saveAll(List<UserDTO> userDTOList)
    {
        logger.debug(" --> saveAll() for userList : {}", userDTOList);
        return (List<User>) userRepository.saveAll(mapper.toUser(userDTOList));
    }

    @Override
    public User update(UserDTO user)
    {
        logger.debug(" --> update() for user : {}", user);
        User us = new User();
        User usr = findByUserId(user.getUserId());
        if (Objects.nonNull(usr))
        {
            us = userRepository.save(usr);
        }
        return us;
    }

    @Override
    public void delete(UUID userId)
    {
        logger.debug(" --> delete() for UserId : {}", userId);
        User usr = findByUserId(userId);
        if (Objects.nonNull(usr))
        {
            userRepository.delete(usr);
        }
    }
}
