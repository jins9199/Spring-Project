package org.js.movie.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.js.movie.member.domain.MemberVO;
import org.js.movie.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.SessionScope;

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
		memberService.login(vo);
		
		return "redirect:../index.do"; //      ../ = 현재위치의 상위경로
	}
	
	//login Get
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String getLogin() {
		return "member/login";
	}
	
	//login Post
	@RequestMapping(value="/login.do" , method=RequestMethod.POST)
	public String postLogin(MemberVO vo, HttpServletRequest req) {
			
		log.info("############ 로그인");
		log.info("############ vo: " + vo);
		log.info("############ req: " + req);
		
		HttpSession session = req.getSession();
		
		log.info("########### session: " + session);
		
		MemberVO login = memberService.login(vo);
		
		log.info("loginVO: " + login);
		if(login == null) {
			session.setAttribute("member", null);
		} else
			session.setAttribute("member", login);
		log.info("sessionAttribute's member: " + session.getAttribute("member"));
		
		return "redirect:../index.do";
	}
	
	//logout
	@RequestMapping(value="/logout.do")
	public String getLogOut(HttpSession session) {
		session.invalidate();
		return "redirect:../index.do";
				
	}
	
	//myPage Get
	@RequestMapping(value="my_page.do" , method=RequestMethod.GET)
	public String getMyPage() {
		
		return "member/my_page";
	}
	
	
	
}

