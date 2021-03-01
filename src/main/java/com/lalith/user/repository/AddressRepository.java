package com.lalith.user.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lalith.user.domain.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, UUID>
{
}
