package org.js.movie.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.js.movie.member.domain.MemberVO;
import org.js.movie.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

	//private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService memberService;
	
	
	//sign_up Get
	@RequestMapping(value="/sign_up.do" , method=RequestMethod.GET)
	public String getSignUp() {
		
		log.info("sign_up.do");
		return "member/sign_up";
	}
	
	//sign_up Post
	@RequestMapping(value="/sign_up.do" , method=RequestMethod.POST)
	public String postSignUp(MemberVO vo) {
		log.info("############ 가입처리");
		log.info("############vo: " + vo);
		
		memberService.insertMember(vo);

		return "redirect:/";
	}
	
//	//login Get
//	@RequestMapping(value="/login.do", method=RequestMethod.GET)
//	public String getLogin() {
//		return "member/login";
//	}
//	
//	//login Post
//	@RequestMapping(value="/login.do" , method=RequestMethod.POST)
//	public String postLogin() {
//		
//		
//		return "redirect:/";
//	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String getlogin() {
		return "member/login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(MemberVO vo, HttpServletRequest req) {
		log.info("#####################post login");
		
		HttpSession session = req.getSession();
		
		MemberVO login = memberService.login(vo);
		
		if(login == null) {
			session.setAttribute("member", null);
		} else
			session.setAttribute("member", login);
		return "redirect:/";
		
	}
	
}

