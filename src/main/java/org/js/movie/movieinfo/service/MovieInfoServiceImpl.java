package org.js.movie.movieinfo.service;

import java.util.List;

import javax.inject.Inject;

import org.js.movie.movieinfo.dao.MovieInfoDAO;
import org.js.movie.movieinfo.domain.MovieInfoVO;
import org.springframework.stereotype.Service;

@Service("MovieInfoService")
public class MovieInfoServiceImpl implements MovieInfoService {

	@Inject
	private MovieInfoDAO dao;
	
	
	@Override
	public List<MovieInfoVO> list() {

		return dao.list();
	}
	
	@Override
	public MovieInfoVO view(int id) {
		
		return dao.view(id);
	}

	@Override
	public void insertMovieInfo(MovieInfoVO vo) {
		
		dao.insertMovieInfo(vo);
	}

	@Override
	public void deleteMovieInfo(String title) {
		
		dao.deleteMovieInfo(title);
	}

	@Override
	public void updateMovieInfo(MovieInfoVO vo) {
		
		dao.updateMovieInfo(vo);
	}

}
