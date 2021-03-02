package com.lalith.user.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.lalith.user.domain.Address;

@Repository
public interface AddressRepository extends PagingAndSortingRepository<Address, UUID>
{
}
