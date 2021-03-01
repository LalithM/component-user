package com.lalith.user.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lalith.user.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, UUID>
{
}
