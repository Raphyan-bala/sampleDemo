package com.example.sampleGateway.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("/hello")
	public String getHello()
	{
		return "hello Iam connect my pro to cloud";
	}

}
