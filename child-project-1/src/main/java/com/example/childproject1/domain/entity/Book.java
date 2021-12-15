package com.example.childproject1.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: Balaji Varadharajan
 * Date: 12/3/2021
 * Time: 11:30 AM
 * To change this template use File | Settings | File and Code Templates.
 */
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private int bookId;

    private String bookName;
}
