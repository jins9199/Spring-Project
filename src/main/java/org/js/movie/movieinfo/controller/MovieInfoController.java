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
	
	@RequestMapping(value="/write_board.do", method = RequestMethod.GET)
	public String getWriteBoard() {
		
		return "write_board";
	}
	
	@RequestMapping(value="/write_board.do", method = RequestMethod.POST)
	public String postWriteBoard(MovieInfoVO vo) {
		
		log.info("postWriteBoard 페이지 시작");
		service.insertMovieInfo(vo);
		log.info("vo : " + vo );

		
		
		return "movie_list"; //작성완료 후 이전 경로로 되돌아간다 (상위 경로)
	}
	
	
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
