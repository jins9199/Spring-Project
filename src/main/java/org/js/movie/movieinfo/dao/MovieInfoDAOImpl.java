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
	public MovieInfoVO view(int id) {
		
		return sql.selectOne("MovieInfoMapper.view", id);
	}

	@Override
	public void insertMovieInfo(MovieInfoVO vo) {
		
		sql.insert("MovieInfoMapper.insert", vo);
	}

	@Override
	public void deleteMovieInfo(String title) {
		
		sql.delete("MovieInfoMapper.delete", title);
	}

	@Override
	public void updateMovieInfo(MovieInfoVO vo) {

		sql.update("MovieInfoMapper.update", vo);
	}

}
