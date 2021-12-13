package com.qa.hiking.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hiking.domain.Hiking;
import com.qa.hiking.service.HikingService;



//tells spring this is a controller - REST compliant
@RestController

public class HikingController {

	private HikingService service;

	@Autowired // Dependency Injection

	public HikingController(HikingService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create") // 201 status code
	public ResponseEntity<Hiking> createHill(@RequestBody Hiking hills) { // pulls the parameter from the body of the request
		Hiking created = this.service.createHill(hills); // gets the last Hill created
		ResponseEntity<Hiking> response = new ResponseEntity<Hiking>(created, HttpStatus.CREATED);
		return response;
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Hiking>> getAllHill() {
		return ResponseEntity.ok(this.service.getAllHills());
	}

	@GetMapping("/get/{id}")
	public Hiking getHill(@PathVariable Integer id) { // id is index because it's an array.
		return this.service.getHill(id);
	}
	
	

	@PutMapping("/replace/{id}")
	public ResponseEntity<Hiking> replaceHill(@PathVariable Integer id, @RequestBody Hiking newHill) {
		Hiking body = this.service.replaceHill(id, newHill);
		ResponseEntity<Hiking> response = new ResponseEntity<Hiking>(body, HttpStatus.ACCEPTED); // 202 accepted
		return response;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Hiking> deleteHill(@PathVariable Integer id) {
		ResponseEntity<Hiking> response = new ResponseEntity<Hiking>(HttpStatus.NO_CONTENT);
		this.service.deleteHill(id.intValue());
		return response;
	}

}
	
	

