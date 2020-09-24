package com.adamzyga.mytestapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.adamzyga.mytestapp.email.service.EmailService;


@RestController
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/sent")
	public String emailSent() {
	
		
		try {
			emailService.sendEmail();
		} catch(MailException e){
			e.printStackTrace();
			
		}
		
		return "redirect:start";
		
	}

}
