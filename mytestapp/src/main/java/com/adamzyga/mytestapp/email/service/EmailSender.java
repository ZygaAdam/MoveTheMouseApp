package com.adamzyga.mytestapp.email.service;

public interface EmailSender {
	 
	void sendEmail(String sender, String subject, String content);
}
