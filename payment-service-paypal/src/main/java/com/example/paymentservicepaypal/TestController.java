package com.example.paymentservicepaypal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {
	
	@GetMapping
	public String sayHello() {
		return "hello from Paypal Payment Service";
	}

}
