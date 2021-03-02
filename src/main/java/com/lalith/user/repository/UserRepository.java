package com.lalith.user.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.lalith.user.domain.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, UUID>
{
}
