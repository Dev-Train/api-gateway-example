package com.example.childproject2.domain.repository;

import com.example.childproject2.domain.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Balaji Varadharajan
 * Date: 12/3/2021
 * Time: 12:33 PM
 * To change this template use File | Settings | File and Code Templates.
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
