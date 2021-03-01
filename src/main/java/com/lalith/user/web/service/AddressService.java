package com.lalith.user.web.service;

import java.util.List;
import java.util.UUID;

import com.lalith.user.domain.Address;
import com.lalith.user.web.model.AddressDTO;

public interface AddressService
{
    Address findByAddressId(UUID addressId);

    List<Address> findAllAddress();

    Address save(AddressDTO address);

    List<Address> saveAll(List<AddressDTO> addressList);

    Address update(AddressDTO address);

    void delete(UUID addressId);
}
