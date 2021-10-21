package com.sbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home page..");
		return "home";
	}
}
