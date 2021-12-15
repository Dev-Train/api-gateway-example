package com.example.childproject2.domain.repository;

import com.example.childproject2.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Balaji Varadharajan
 * Date: 12/3/2021
 * Time: 11:32 AM
 * To change this template use File | Settings | File and Code Templates.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
