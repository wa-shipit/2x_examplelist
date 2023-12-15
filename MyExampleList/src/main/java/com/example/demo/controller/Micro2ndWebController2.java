package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Micro2ndWebController2 {

	@RequestMapping(path = "/micro2nd", method = RequestMethod.GET)
	public String first() {

		return "micro2nd";
	}

}
