package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleDisplayController {

	/**
	 * 【サンプル】
	 * ただただhtmlを表示するだけ。
	 */
	@RequestMapping(path = "/simpledisplay", method = RequestMethod.GET)
	public String first() {

		//returnの後ろにはhtmlの名前を書く。
		//例えば↓の例は「simpledisplay.html」を指す。
		return "simpledisplay";
	}

}
