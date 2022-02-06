package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/sample")
public class ApiController {
@GetMapping("/welcome")
public String messgae() {
	return "Welcome";
}
}
