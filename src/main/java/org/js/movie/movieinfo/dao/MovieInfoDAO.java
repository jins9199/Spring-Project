package org.js.movie.movieinfo.dao;

import java.util.List;

import org.js.movie.movieinfo.domain.MovieInfoVO;

public interface MovieInfoDAO {
	
	public List<MovieInfoVO> list();
	
	public MovieInfoVO view(int id);
	
}
