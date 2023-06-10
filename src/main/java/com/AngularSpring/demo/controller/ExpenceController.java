package com.AngularSpring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AngularSpring.demo.model.expences;
import com.AngularSpring.demo.service.ExprenceInterfaceImpl;


@CrossOrigin
@RestController
@RequestMapping("/me/first")
public class ExpenceController {
	
	@Autowired
	ExprenceInterfaceImpl Eempl;
	//Get the orginal Data 
	@GetMapping("/exp")
	public ResponseEntity<List<expences>> allme() {
		
		 List<expences> exp= Eempl.getAll();
		 return new ResponseEntity<List<expences>>(exp,HttpStatus.OK);
	}
	//Post the new Data
	@CrossOrigin
	@PostMapping("/exp")
	public ResponseEntity<expences> upexp( @RequestBody expences et) {
		System.out.println("I am here");
		expences exp1= Eempl.updateExp(et);
		return new ResponseEntity<expences>(exp1,HttpStatus.OK); }
		
   //Get by ID
	@CrossOrigin
		@GetMapping("/exp/{id}")
		public ResponseEntity<expences> getbySpeaficID( @PathVariable("id") Long id) {
			System.out.println("I am here");
			expences exp2= Eempl.getbyID(id);
			return new ResponseEntity<expences>(exp2,HttpStatus.OK); 
		
		
	}

}
