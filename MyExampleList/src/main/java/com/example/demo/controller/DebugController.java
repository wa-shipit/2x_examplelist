package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DebugController {

	/**
	 * デバッグ用です。何かをしないといけないわけではないです。
	 * 5問目のプログラムがミスがあったときに
	 * 毎回1問目からやり直すと大変なので、
	 * 直接URLを叩いてアクセスできるようにしてます。
	 */
	@RequestMapping(path = "/q1", method = RequestMethod.GET)
	public String q1() {

		return "q1";
	}

	@RequestMapping(path = "/q2", method = RequestMethod.GET)
	public String q2() {

		return "q2";
	}

}
