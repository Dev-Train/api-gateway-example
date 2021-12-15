package com.example.childproject1.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by IntelliJ IDEA.
 * User: Balaji Varadharajan
 * Date: 12/3/2021
 * Time: 12:35 PM
 * To change this template use File | Settings | File and Code Templates.
 */
@SpringBootTest
@Slf4j
class BookControllerTest {

    @Autowired
    WebApplicationContext wac;

    protected MockMvc mockMvc;

    @Test
    void testGetAllBooks() throws Exception {
        log.info("Test Books Passed");
    }

}