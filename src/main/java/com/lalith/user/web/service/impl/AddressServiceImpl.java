package com.lalith.user.web.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lalith.user.domain.Address;
import com.lalith.user.exception.NoDataFoundException;
import com.lalith.user.repository.AddressRepository;
import com.lalith.user.web.mapper.EntityToDTOMapper;
import com.lalith.user.web.model.AddressDTO;
import com.lalith.user.web.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService
{
    private static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    EntityToDTOMapper mapper;

    @Override
    public Address findByAddressId(UUID addressId)
    {
        logger.debug(" --> findByAddressId() for addressId : {}", addressId);
        return addressRepository.findById(addressId)
                .orElseThrow(() -> new NoDataFoundException("Address not found for Address Id " + addressId));
    }

    @Override
    public List<Address> findAllAddress()
    {
        logger.debug(" --> findByAddressId()");
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public Address save(AddressDTO address)
    {
        logger.debug(" --> save() for Address :{}", address);
        return addressRepository.save(mapper.toAddress(address));
    }

    @Override
    public List<Address> saveAll(List<AddressDTO> addressList)
    {
        logger.debug(" --> saveAll() for AddressList : {}", addressList);
        return (List<Address>) addressRepository.saveAll(mapper.toAddress(addressList));
    }

    @Override
    public Address update(AddressDTO address)
    {
        logger.debug(" --> update() for Address : {}", address);
        Address adds = new Address();
        Address add = findByAddressId(address.getAddressId());
        if (Objects.nonNull(add))
        {
            adds = addressRepository.save(add);
        }
        return adds;
    }

    @Override
    public void delete(UUID addressId)
    {
        logger.debug(" --> delete() for AddressId : {}", addressId);
        Address add = findByAddressId(addressId);
        if (Objects.nonNull(add))
        {
            addressRepository.delete(add);
        }

    }
}
