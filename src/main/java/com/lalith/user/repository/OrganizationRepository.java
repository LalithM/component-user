package com.lalith.user.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lalith.user.model.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization,UUID>
{
}
