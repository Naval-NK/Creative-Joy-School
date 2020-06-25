package com.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dao.ContactDao;
import com.school.dto.ContactPage;

@Service
public class ContactServiceImple implements ContactService{

	@Autowired
	ContactDao contactDao;

	@Override
	public void addDetails(ContactPage contact) {
		contactDao.addDetails(contact);		
	}
	
	
	
}