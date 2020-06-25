package com.school.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.school.dto.ContactPage;

@Repository
public class ContactDaoImple implements ContactDao {

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public void addDetails(ContactPage contact) {
		System.out.println("ALL DETAILS : " + contact);
		System.out.println("INSIDE dbImplementation");
		String sql = "insert into contact(childName,parentName,parentEmail,parentMobile,grade,message) values(?,?,?,?,?,?)";
		
		int i = jdbc.update(sql, new Object[] {contact.getChildName(),contact.getParentName(),contact.getParentEmail(),contact.getParentMobile(),contact.getGrade(),contact.getMessage()});
			System.out.println("Inserted");	
		System.out.println("DATA INSERT :: " + i);
	}

	

}
