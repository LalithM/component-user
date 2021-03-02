package com.lalith.user.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.lalith.user.domain.Organization;

@Repository
public interface OrganizationRepository extends PagingAndSortingRepository<Organization, UUID>
{
}
