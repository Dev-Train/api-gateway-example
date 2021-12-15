package com.example.childproject1.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Balaji Varadharajan
 * Date: 12/3/2021
 * Time: 11:22 AM
 * To change this template use File | Settings | File and Code Templates.
 */
@RestController
@RequestMapping("api/v1/book")
public class BookController {

    @GetMapping
    public ResponseEntity<String> getAllBooks(){
        return ResponseEntity.ok().body("Hello Books Again!!");
    }
}
