package com.adamzyga.mytestapp.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.thymeleaf.TemplateEngine;

import com.adamzyga.mytestapp.email.service.EmailSender;

@Controller
public class EmailController {
	
    private final EmailSender emailSender;
    private final TemplateEngine templateEngine;
    
    @Autowired
    public EmailController(EmailSender emailSender,
                           TemplateEngine templateEngine){
        this.emailSender = emailSender;
        this.templateEngine = templateEngine;
    }

}
