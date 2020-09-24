package com.adamzyga.mytestapp.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
public class EmailService {

	private JavaMailSender javaMailSender;
	
	@Autowired
	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public void sendEmail() throws MailException {
		
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo("");
		mail.setFrom("");
		mail.setSubject("TEST GOWNO");
		mail.setText("gowno");
		
		javaMailSender.send(mail);
		
	}
}
