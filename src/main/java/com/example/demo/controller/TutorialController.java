package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tutorial;
import com.example.demo.repository.TutorialRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class TutorialController {
	 @Autowired
	 private TutorialRepository tutoRepo;

	 @GetMapping("/fetch_tutorial")
	public List<Tutorial> getListTutorial(){
		 return tutoRepo.findAll();
	 }
	 
	  @PostMapping("/tutorials")
	  public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
	    Tutorial _tutorial =tutoRepo.save(tutorial);
	    return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
	   
	  }
	  
	 
	  
}
