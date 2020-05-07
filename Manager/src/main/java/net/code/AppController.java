package net.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String viewHome() {
		
		return "index";
	}
}
