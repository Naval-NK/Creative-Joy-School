package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.dto.ContactPage;
import com.school.service.ContactService;
import com.school.service.EmailService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {

	@Autowired
	ContactService contactServ;
	@Autowired
	EmailService emailServ;
	
	@PostMapping("/contact")
	void saveMailDetails(@RequestBody ContactPage contact) {
		contactServ.addDetails(contact);
		emailServ.sendEmailToAdmin(contact);
				
	}
	

}
