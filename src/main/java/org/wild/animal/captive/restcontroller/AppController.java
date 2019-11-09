package org.wild.animal.captive.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui")
public class AppController {
	
	@GetMapping("/")
	public String home() {
		return "welcome";
	}
	

}
