package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
