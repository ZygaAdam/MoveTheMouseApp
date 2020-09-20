package com.adamzyga.mytestapp.controller;


import java.awt.MouseInfo;
import java.awt.Robot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MoveTheMouseController {
	
	private boolean bool;

	@GetMapping("/start")
	public String test(Model theModel) {
		
		return "move-the-mouse";
	}
	

	@RequestMapping("/move")
	public String moveTheMouseMethod() throws Exception {
		bool = true;
		
		System.setProperty("java.awt.headless", "false");
	    
	    Robot hal = new Robot();
	    while(bool){
	        hal.delay(1000 * 5);
	        int x = MouseInfo.getPointerInfo().getLocation().x + 2;
	        int y = MouseInfo.getPointerInfo().getLocation().y+ 2;
	        hal.mouseMove(x,y);   
	    }
	    
	    return "redirect:start";
	}
	
	@RequestMapping("/stop")
	public String stopTheMouse () {
		bool=false;
		
		return "redirect:start";
	}
	
	@GetMapping("/contact")
	public String contactUs() {
		
		return "contact";
	}

	
	
}