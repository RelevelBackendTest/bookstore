package com.relevel.backend.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
    @GetMapping("/ping")
	public String ping() {
		return "Ping is Successful, Proceed with Problem Statements";
	}
}
