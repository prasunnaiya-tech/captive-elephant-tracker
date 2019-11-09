package org.wild.animal.captive.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/test")
	public ResponseEntity<String> testMethod() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>("Success!!", HttpStatus.OK);
	}

}
