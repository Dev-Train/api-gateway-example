package com.example.childproject1.domain.repository;

import com.example.childproject1.domain.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Balaji Varadharajan
 * Date: 12/3/2021
 * Time: 12:34 PM
 * To change this template use File | Settings | File and Code Templates.
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
