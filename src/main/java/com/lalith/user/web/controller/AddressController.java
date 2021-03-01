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

import com.lalith.user.domain.Address;
import com.lalith.user.web.model.AddressDTO;
import com.lalith.user.web.service.AddressService;

@Validated
@RestController
@RequestMapping("/api/address")
public class AddressController
{
    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    AddressService addressService;

    @GetMapping("/{addressId}")
    public ResponseEntity<Address> getByAddressId(@NotNull @PathVariable("addressId") UUID addressId)
    {
        logger.debug(" --getByAddressId() for addressId :{}", addressId);
        return ResponseEntity.ok(addressService.findByAddressId(addressId));
    }

    @GetMapping("/")
    public ResponseEntity<List> getAll()
    {
        logger.debug(" --getAll()");
        return ResponseEntity.ok(addressService.findAllAddress());
    }

    @PostMapping("/save")
    public ResponseEntity<Address> saveAddress(@Valid @RequestBody AddressDTO address)
    {
        logger.debug(" --saveAddress()");
        return new ResponseEntity<Address>(addressService.save(address), HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Address> updateAddress(@Valid @RequestBody AddressDTO address)
    {
        logger.debug(" --updateAddress() : {}",address);
        return new ResponseEntity<Address>(addressService.update(address), HttpStatus.CREATED);
    }

    @DeleteMapping("/{addressId}")
    public ResponseEntity<Object> deleteAddress(@NotNull @PathVariable("addressId") UUID addressId)
    {
        logger.debug(" --deleteAddress() for addressId : {}",addressId);
        addressService.delete(addressId);
        return ResponseEntity.ok("deleted");
    }
}
