package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWordController {

	@GetMapping("/hellooo")
	public String showHello() {
		return "hello";
	}

	@GetMapping("/show")
	public String showDetail() {
		return "showDetails";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}
}
