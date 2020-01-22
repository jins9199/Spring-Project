package org.js.movie;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.js.movie.movieinfo.domain.MovieInfoVO;
import org.js.movie.movieinfo.service.MovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@Autowired
	MovieInfoService service;
	
	@RequestMapping(value = {"/", "index.do"} , method = RequestMethod.GET)
	public String getIndex(Model model, HttpServletRequest request) {
		
		log.info("HomeController 진입");
		String nowPath = request.getSession().getServletContext().getRealPath("resources");
		log.info("vo : " + nowPath);
		
		List<MovieInfoVO> list = null;
		list = service.list();
		
		log.info("list : " +list);
		
		model.addAttribute("list", list);
		model.addAttribute("path", nowPath);		
		return "index";
	}
}



//
