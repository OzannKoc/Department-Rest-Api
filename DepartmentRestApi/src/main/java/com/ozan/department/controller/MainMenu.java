package com.ozan.department.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainMenu {
	
	
	
	@GetMapping("/")
	public String mainMenu() {
			return "main-menu";
		}
}
