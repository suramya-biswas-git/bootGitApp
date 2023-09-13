package org.anudip.bootGitApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String showHello() {
		return "Hello";
	}
	@GetMapping("/hi")
	public String showHi() {
		return "Hi";
	}

}
