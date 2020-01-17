package org.js.movie.movieinfo.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.js.movie.movieinfo.domain.MovieInfoVO;
import org.springframework.stereotype.Repository;

@Repository("MovieInfoDao")
public class MovieInfoDAOImpl implements MovieInfoDAO {
	
	@Inject
	private SqlSession sql;
	
	
	@Override
	public List<MovieInfoVO> list() {

		return sql.selectList("MovieInfoMapper.list");
	}
	
	@Override
	public MovieInfoVO view(int id) {
		
		return sql.selectOne("MovieInfoMapper.view", id);
	}

}
