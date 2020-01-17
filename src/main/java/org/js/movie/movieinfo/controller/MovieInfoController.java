package org.js.movie.movieinfo.controller;

import org.js.movie.movieinfo.domain.MovieInfoVO;
import org.js.movie.movieinfo.service.MovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieInfoController {

	
	@Autowired
	MovieInfoService service;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String getIndex(Model model) {
//		
//		List<MovieInfoVO> list = null;
//		list = service.list();
//		
//		model.addAttribute("list", list);
//
//		return "index";
//	}
	@RequestMapping (value = "/movie_info", method = RequestMethod.GET)
	public void getMovieInfo(@RequestParam("id") int id, Model model) throws Exception {
			
		MovieInfoVO vo = service.view(id);
		
		model.addAttribute("view", vo);
	}
	
	@RequestMapping (value ="/write_board", method = RequestMethod.GET)
	public void getMovieWrite() {
	}
	
	@RequestMapping(value = "/write_board", method = RequestMethod.POST)
	public String posttWrite(MovieInfoVO vo) throws Exception{
		service.write(vo);
		
		return "redirect:/";
	}
	
	
}
