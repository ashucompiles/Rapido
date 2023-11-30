package com.example.Rapido;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/go")
public class CustomerRapido {
	@GetMapping(path="/ashu")
	public String check() {
		return "Hello World !";
	}

}
