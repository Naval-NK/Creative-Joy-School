package com.school.service;

import com.school.dto.ContactPage;

public interface EmailService {
	public void sendEmailToAdmin(ContactPage contact);
}
