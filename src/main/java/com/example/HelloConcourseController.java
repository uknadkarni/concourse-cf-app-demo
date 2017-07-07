package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConcourseController {
	
	@Value("${message}")
	private String message;

	public HelloConcourseController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String message(){
		return this.message;
	}

}
