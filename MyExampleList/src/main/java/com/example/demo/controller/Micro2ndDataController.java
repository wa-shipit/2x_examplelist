package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Micro2ndDataController {

	@RequestMapping(path = "/receive/{param1}", method = RequestMethod.GET)
	public String first(@PathVariable String param1) {

		return "あなたは前回" + param1 + "って打ったね";
	}

	/*
	 * 演習問題用
	 */
	//	@RequestMapping(path = "/receiveenshu/{?????}/{????}", method = RequestMethod.GET)
	//	public String en(@PathVariable String ?????, @PathVariable String ????) {
	//
	//		return paramEnshu1 + paramEnshu2;
	//	}

	/*
	 * 応用問題用
	 */
	//	@RequestMapping(path = "/receiveouyou/?????", method = RequestMethod.GET)
	//	public String ou(????) {
	//
	//		return "";
	//	}
}
