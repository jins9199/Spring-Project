package org.js.movie.auth.service;

import org.js.movie.auth.mapper.AuthMemberMapper;
import org.js.movie.member.domain.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Repository
public class AuthServiceImpl implements AuthService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public boolean hasUsername(String username) {
		
		log.info("hasUsername");
		
		return sqlSession.getMapper(AuthMemberMapper.class).hasUsername(username)==1 ? true : false;
	}

	@Override
	public void insertUsers(MemberVO mvo, String role) {
	
		log.info("insertUsers");
		
		sqlSession.getMapper(AuthMemberMapper.class).insertMemberRoles(mvo.getMemberID(), role);

	}

}
