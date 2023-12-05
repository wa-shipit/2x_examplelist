package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class HttpSessionOuyouController {

	@RequestMapping(path = "/sessionouyoua", method = RequestMethod.GET)
	public String a() {

		return "sessionouyoua";
	}

	@RequestMapping(path = "/sessionouyoua", method = RequestMethod.POST)
	public String ap(String ouyoua, HttpSession session) {

		return "sessionouyoub";
	}

	@RequestMapping(path = "/sessionouyoub", method = RequestMethod.POST)
	public String bp(String ouyoub, HttpSession session) {

		return "sessionouyouc";
	}

	@RequestMapping(path = "/sessionouyouc", method = RequestMethod.POST)
	public String cp(String ouyouc, HttpSession session) {

		return "sessionouyoud";
	}

	@RequestMapping(path = "/sessionouyoud", method = RequestMethod.GET)
	public String d(HttpSession session) {

		return "sessionouyoud";
	}
}
