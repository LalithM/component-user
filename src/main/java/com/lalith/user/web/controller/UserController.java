package com.lalith.user.web.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lalith.user.domain.User;
import com.lalith.user.web.model.UserDTO;
import com.lalith.user.web.service.UserService;

@Validated
@RestController
@RequestMapping("/api/user")
public class UserController
{
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<User> getByUserId(@NotNull @PathVariable("userId") UUID userId)
    {
        logger.debug(" --getByUserId() for userId :{}", userId);
        return ResponseEntity.ok(userService.findByUserId(userId));
    }

    @GetMapping("/")
    public ResponseEntity<List> getAll()
    {
        logger.debug(" --getAll()");
        return ResponseEntity.ok(userService.findAllUsers());
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@Valid @RequestBody UserDTO user)
    {
        logger.debug(" --saveUser() : {}", user);
        return new ResponseEntity<User>(userService.save(user), HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<User> updateUser(@Valid @RequestBody UserDTO user)
    {
        logger.debug(" --updateUser() : {}", user);
        return new ResponseEntity<User>(userService.update(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Object> deleteUser(@NotNull @PathVariable("addressId") UUID userId)
    {
        logger.debug(" --deleteUser() for userId : {}", userId);
        userService.delete(userId);
        return ResponseEntity.ok("deleted");
    }
}
