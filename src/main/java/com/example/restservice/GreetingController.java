package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/saludo")
	public Greeting greeting(@RequestParam(value = "nombre", defaultValue = "V1.0.0") String name) {
		return new Greeting(counter.incrementAndGet(), name);
	}
}