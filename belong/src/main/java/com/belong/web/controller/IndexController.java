package com.belong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller 
public class IndexController {
   
	@RequestMapping(value={"/","/index"})
	public String redirectIndex() {
		return "index";
	} 


}
