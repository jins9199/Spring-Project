package org.js.movie.movieinfo.controller; // //import java.util.List; //

import java.util.List;

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
public class MovieInfoController {

	
	@Autowired
	MovieInfoService service;
	
	@RequestMapping(value="/movie_list.do")
	public String getMovieList() {
		
		return "movie_list";
	}
	
	
	
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndex(Model model) {
		
		List<MovieInfoVO> list = null;
		list = service.list();
		
		model.addAttribute("list", list);

		return "index";
	}
}
