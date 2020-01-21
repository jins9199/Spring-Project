package org.js.movie.movieinfo.controller; // //import java.util.List; //

import java.io.File;

import javax.annotation.Resource;

import org.js.movie.movieinfo.domain.MovieInfoVO;
import org.js.movie.movieinfo.service.MovieInfoService;
import org.js.movie.utils.UploadFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MovieInfoController {

	@Autowired
	MovieInfoService service;
	
	@Resource(name="uploadPath")
	private String uploadPath;
	
	@RequestMapping(value="/movie_info", method=RequestMethod.GET)
	public void getMovieInfo(@RequestParam("id") int id, Model model) throws Exception {
		
		MovieInfoVO vo = service.view(id);
		
		model.addAttribute("view", vo);
	}
	
	
	
	
	@RequestMapping(value="/write_board.do", method = RequestMethod.GET)
	public String getWriteBoard() {
		
		
		
		return "write_board";
	}
	
	@RequestMapping(value="/write_board.do", method = RequestMethod.POST)
	public String postWriteBoard(MovieInfoVO vo, MultipartFile file) throws Exception {
		
		log.info("postWriteBoard 페이지 시작");
		
		String imgUploadPath = uploadPath + File.separator + "image";
		String ymdPath = UploadFileUtil.calcPath(imgUploadPath);
		String fileName = null;

		log.info("imgUploadPath : " + imgUploadPath);
		log.info("ymdPath : " + ymdPath);
		
		if(file != null) {
		 fileName =  UploadFileUtil.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath); 
		} else {
		 fileName = uploadPath + File.separator + "images" + File.separator + "none.png";
		}

		vo.setPoster(File.separator + "image" + ymdPath + File.separator + fileName);
		vo.setThumbNail(File.separator + "image" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
		vo.setStillCut(File.separator + "image" + ymdPath + File.separator + fileName);
		
		service.insertMovieInfo(vo);
		log.info("vo : " + vo );

		
		
		return "movie_list"; //작성완료 후 이전 경로로 되돌아간다 (상위 경로)
	}
	
	
	@RequestMapping(value="/movie_list.do")
	public String getMovieList() {
		
		return "movie_list";
	}

}
