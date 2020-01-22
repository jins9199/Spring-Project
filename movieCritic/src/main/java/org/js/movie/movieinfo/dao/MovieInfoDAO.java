package org.js.movie.movieinfo.dao;

import java.util.List;

import org.js.movie.movieinfo.domain.MovieInfoVO;

public interface MovieInfoDAO {
	
	//게시글 작성
	public void insertMovieInfo(MovieInfoVO vo);
	
	//게시글 삭제
	public void deleteMovieInfo(int movieId);
	
	//게시글 수정
	public void updateMovieInfo(MovieInfoVO vo);
	
	//게시글 목록 조회
	public List<MovieInfoVO> list();
	
	//게시글 상세 조회
	public MovieInfoVO view(int movieId);
	
}
