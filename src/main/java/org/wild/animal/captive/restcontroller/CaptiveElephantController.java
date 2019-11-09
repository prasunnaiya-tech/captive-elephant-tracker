package org.wild.animal.captive.restcontroller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wild.animal.captive.entity.ElephantDetails;
import org.wild.animal.captive.service.CaptiveElephantService;

@RestController
@RequestMapping("/rest")
public class CaptiveElephantController {
	
	private static final Logger logger = LoggerFactory.getLogger(CaptiveElephantController.class);
	
	@Autowired
	CaptiveElephantService captiveElephantService;
	
	@GetMapping("/test")
	public ResponseEntity<String> testMethod() {
		return new ResponseEntity<>("Success!!", HttpStatus.OK);
	}
	
	@RequestMapping(value="/elephant", method=RequestMethod.GET)
	public ResponseEntity<List<ElephantDetails>> searchAllElephantDetail(){
    	logger.info("Returning all the Elephant Details´s");
		return new ResponseEntity<List<ElephantDetails>>(captiveElephantService.searchAllElephantDetail(), HttpStatus.OK);
	}
	
    @RequestMapping(value = "/elephant/{id}", method = RequestMethod.GET)
	public ResponseEntity<ElephantDetails> searchElephantById(@PathVariable("id") long id) throws Exception{
    	logger.info("Elephant id to return " + id);
    	ElephantDetails elephantDetails = captiveElephantService.searchElephantById(id);
    	if (elephantDetails == null || elephantDetails.getElephantId() <= 0){
            throw new Exception("Elephant doesn´t exist");
    	}
		return new ResponseEntity<ElephantDetails>(captiveElephantService.searchElephantById(id), HttpStatus.OK);
	}

	/*
	 * @RequestMapping(value = "/elephant/{id}", method = RequestMethod.DELETE)
	 * public ResponseEntity<Response> removeToDoById(@PathVariable("id") long id)
	 * throws Exception{ logger.info("Elephant id to remove " + id); ElephantDetails
	 * elephantDetails = captiveElephantService.searchElephantById(id); if
	 * (elephantDetails == null || elephantDetails.getElephantId() <= 0){ throw new
	 * Exception("Elephant to delete doesn´t exist"); }
	 * captiveElephantService.removeElephantDetails(elephantDetails); return new
	 * ResponseEntity<Response>(new Response(HttpStatus.OK.value(),
	 * "Elephant has been deleted"), HttpStatus.OK); }
	 */
    @RequestMapping(value = "/elephant", method = RequestMethod.POST)
   	public ResponseEntity<ElephantDetails> saveToDo(@RequestBody ElephantDetails payload) throws Exception{
    	logger.info("Payload to save " + payload);
    	/*if (!PayloadValidator.validateCreatePayload(payload)){
            throw new Exception("Payload malformed, id must not be defined");
    	}*/
		return new ResponseEntity<ElephantDetails>(captiveElephantService.saveElephantDetails(payload), HttpStatus.OK);
   	}
    
    @RequestMapping(value = "/elephant", method = RequestMethod.PATCH)
   	public ResponseEntity<ElephantDetails>  updateToDo(@RequestBody ElephantDetails payload) throws Exception{
    	logger.info("Payload to update " + payload);
    	ElephantDetails elephantDetails = captiveElephantService.searchElephantById(payload.getElephantId());
    	if (elephantDetails == null || elephantDetails.getElephantId() <= 0){
            throw new Exception("Elephant to update doesn´t exist");
    	}
		return new ResponseEntity<ElephantDetails>(captiveElephantService.saveElephantDetails(payload), HttpStatus.OK);
   	}
	
}

