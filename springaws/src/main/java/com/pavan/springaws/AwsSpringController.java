package com.pavan.springaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class AwsSpringController {

	@GetMapping("/")
	public String Sample() {
		return "Hello! Killer";
	}
}
