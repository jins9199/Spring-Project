package org.js.movie.movieinfo.dao;

import java.util.List;

import javax.inject.Inject;

import org.js.movie.movieinfo.domain.MovieInfoVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("MovieInfoDao")
public class MovieInfoDAOImpl implements MovieInfoDAO {
	
	@Inject
	private SqlSessionTemplate sql;
	
	
	public List<MovieInfoVO> list() {

		return sql.selectList("MovieInfoMapper.list");
	}
	
	@Override
	public MovieInfoVO view(int movieId) {
		
		return sql.selectOne("MovieInfoMapper.view", movieId);
	}

	@Override
	public void insertMovieInfo(MovieInfoVO vo) {
		
		sql.insert("MovieInfoMapper.insert", vo);
	}

	@Override
	public void deleteMovieInfo(int movieId) {
		
		sql.delete("MovieInfoMapper.delete", movieId);
	}

	@Override
	public void updateMovieInfo(MovieInfoVO vo) {

		sql.update("MovieInfoMapper.update", vo);
	}

}
