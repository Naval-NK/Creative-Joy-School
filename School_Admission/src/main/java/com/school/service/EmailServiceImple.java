package com.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.school.dto.ContactPage;

@Service
public class EmailServiceImple implements EmailService {

	@Autowired
	public JavaMailSender jMailSend ;
	
	
	
//	@GetMapping("/sendmail")
	public void sendEmailToAdmin(ContactPage contact) {	

		SimpleMailMessage msg = new SimpleMailMessage();
		
		String cname = contact.getChildName();
		String pname = contact.getParentName();
		String pemail = contact.getParentEmail();
		String mob = contact.getParentMobile();
		String grade = contact.getGrade();
		String message = contact.getMessage();
		
		System.out.println("SendingMail");
//		WEB OWNER
		msg.setTo("navalkulkarni25@gmail.com");
//		SUBJECT
		msg.setSubject("Regarding CreativeJoy School Admission Enquiry");
//		BODY
		msg.setText("Please find given details : \n"+"Child Name : " + cname +"\nParent Name : " +pname+"\nEmail : "+pemail+"\nMobile Number : "+mob+"\nGrade : "+grade +"\nMessage : "+message );
		
		
		
		jMailSend.send(msg);
		System.out.println("Mail Sent");
//		return "Email sent successfully ... !";
	}
}
