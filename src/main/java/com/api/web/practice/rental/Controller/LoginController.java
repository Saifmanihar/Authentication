package com.api.web.practice.rental.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoginController {

	@GetMapping("/")
	public String welcomePage() {
	    return "Successfully login through google authentication";
	}

	@GetMapping("/auth")
	public String LoginPage() {
	    return "Successfully login throw google authentication";
	}

   
}
