package br.com.maps.financeiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RestController
public class HelloController {
	
	@GetMapping("/")
	public String helloMessage() {
		return "Hello, Digital Innovation One!";
		
	}
	
}
