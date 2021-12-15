package com.example.childproject2.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: Balaji Varadharajan
 * Date: 12/3/2021
 * Time: 11:31 AM
 * To change this template use File | Settings | File and Code Templates.
 */
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue
    private int customerId;

    private String firstName;
}
