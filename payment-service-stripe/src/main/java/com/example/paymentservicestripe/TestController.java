package com.example.paymentservicestripe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

	@GetMapping
	public String sayHello() {
		return "Hello from Stripe Payment Service!";
	}
}
