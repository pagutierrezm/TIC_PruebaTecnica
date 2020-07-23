package com.App.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ContactoController {


	@RequestMapping("contactenos.html")
	public String index() {
					
		
		return "contactenos";
	
}
	
	
	
	
}