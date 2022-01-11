package com.example.demo.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	@GetMapping("/test")
	public ResponseEntity<String> holaMundo(){
		return new ResponseEntity<>("Hola mundo", HttpStatus.OK);
	}
}
