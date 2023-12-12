package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class MicroController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping(path = "/microhome", method = RequestMethod.GET)
	public String mhg() {

		return "microhome";
	}

	@RequestMapping(path = "/microhome", method = RequestMethod.POST)
	public String mhp(HttpSession session, String username) {

		session.setAttribute("uname", username);
		return "redirect:/question";
	}

	@RequestMapping(path = "/question", method = RequestMethod.GET)
	public String qg() {

		return "q1";
	}

	/*
	 * 【例】
	 * URLの末尾を変数として受け取り、変数「choice」に格納する。
	 * その後、セッションに変数「choice」を
	 * 「q1ans」という名前で格納する。
	 * 最後に2問目のHTMLを表示して終わり。
	 */
	@RequestMapping(path = "/q1/{choice}", method = RequestMethod.GET)
	public String qg(@PathVariable String choice, HttpSession session) {

		//1問目の質問をセッションに格納する。
		session.setAttribute("q1ans", choice);
		return "q2";
	}

	//	/*
	//	 * 質問②用
	//	 */
	//	@RequestMapping(path = "/q1/q2/{choice}", method = RequestMethod.GET)
	//	public String q2g(???????, HttpSession session) {
	//
	//		//2問目の回答をセッションに格納する。
	//		session.setAttribute("????", );
	//		return "q3";
	//	}
	//
	//	/*
	//	 * 質問③用
	//	 */
	//	@RequestMapping(path = "/q1/q2/q3/{}", method = RequestMethod.GET)
	//	public String q3g(???????, HttpSession session) {
	//
	//		//3問目の回答をセッションに格納する。
	//		session.setAttribute("????", );
	//		return "q4";
	//	}
	//
	//	/*
	//	 * 質問④用
	//	 */
	//	@RequestMapping(path = "/q1/q2/q3/q4/{}", method = RequestMethod.GET)
	//	public String q4g(???????, HttpSession session) {
	//
	//		//1～3問目の回答をセッションから取り出して、変数「x」「y」「z」に格納する。
	//		String x = (String) session.getAttribute("?????");
	//		
	//		//x,y,zと4問目の回答を文字列結合し、変数「type」に格納する。
	//		String type = x + y + z + ????;
	//		
	//		
	//		//変数typeによって診断結果をresultに格納する。
	//		String result = "";
	//		if("istj".equals(????)) {
	//			result = "あなたは「義務遂行者」です。実用的で真面目、事実に基づいて行動する。組織と責任を重んじます。";
	//		} else {
	//			//以下たくさん
	//		}
	//		
	//		//resultをセッションに格納する。
	//		session.setAttribute("????", ?????);
	//		
	//		//画面表示
	//		return "result";
	//	}

	/*
	 * 追加仕様用
	 */
	//	@RequestMapping(path = "/question/save", method = RequestMethod.GET)
	//	public String qs(???????) {
	//
	//		//sessionから必要な情報を取り出す。
	//		//変数「x」にはユーザ名、変数「y」には死んだ結果を取り出す。
	//		String x = session.getAttribute("?????");
	//		String y = session.getAttribute("?????");
	//		
	//		//DBに登録する。
	//		jdbcTemplate.update("INSERT文　がんばれ～");
	//		
	//		return "redirect:/microhome";
	//	}

}
