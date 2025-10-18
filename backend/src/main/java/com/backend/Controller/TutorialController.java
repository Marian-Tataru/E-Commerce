package com.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {
	
	@GetMapping("/api")
	public String simpleSoup(){
		return "SimpleSoup";
	}
}
