package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class SougouEnshuController {

	@RequestMapping(path = "/souen", method = RequestMethod.GET)
	public String a() {
		return "souen";
	}

	/*
	 * 総合演習①
	 * ボタンを押したときのURLの末尾を変数として受け取り、
	 * 受け取った値をsessionに格納しなさい。
	 * ★★以下を必ず守る事(ヒントです)★★
	 * 
	 * ①URLを変数として受け取る時の変数名は「param1」とする事
	 * ②sessionに格納する際の名前は「ses1」とする事
	 * 
	 */
	@RequestMapping(path = "/souen/{}", method = RequestMethod.GET)
	public String first(HttpSession session) {
		/*
		 * 総合演習①用メソッドだよ。
		 */

		return "souenparam";
	}

	/*
	 * 総合演習②　問題文part1
	 * ボタンを押したときのURLの末尾(ok or ng)を変数として受け取り、
	 * 受け取った値をsessionに格納しなさい。
	 * ★★以下を必ず守る事(ヒントです)★★
	 * 
	 * ①URLを変数として受け取る時の変数名は「param2」とする事
	 * ②sessionに格納する際の名前は「ses2」とする事
	 * 
	 */
	@RequestMapping(path = "/souen/menu/{}", method = RequestMethod.GET)
	public String ap(HttpSession session) {
		/*
		 * 総合演習② 問題文part2
		 * 
		 * もしもURLから受け取った値がokなら
		 * 「souenresult.html」を表示し、
		 * そうでないなら
		 * 「souen.html」を表示する事
		 */

		return "souenresult";
	}
}