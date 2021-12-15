package com.example.childproject2.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: Balaji Varadharajan
 * Date: 12/3/2021
 * Time: 11:13 AM
 * To change this template use File | Settings | File and Code Templates.
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity getAllCustomers(){
        ResponseEntity<String> bookValue = restTemplate.getForEntity("http://BOOK-SERVICE/api/v1/book", String.class);
        log.info(bookValue.getBody());
        return ResponseEntity.ok().body("Hello Customers again!");
    }
}
