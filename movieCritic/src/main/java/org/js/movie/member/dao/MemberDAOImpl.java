package org.js.movie.member.dao;

import java.util.List;

import org.js.movie.member.domain.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<MemberVO> selectAllMember() {

		return sqlSession.selectList("MemberMapper.selectAllMember");
	}

	@Override
	public void insertMember(MemberVO vo) {
		
		sqlSession.insert("MemberMapper.insertMember", vo);
	}

	@Override
	public MemberVO selectOneMember(String memberID) {

		return sqlSession.selectOne("MemberMapper.selectOneMember");
	}

	@Override
	public void updateMember(MemberVO vo) {

		sqlSession.update("MemberMapper.updateMember", vo);
	}

	@Override
	public void deleteMember(String memberID) {

		sqlSession.delete("MemberMapper.deleteMember");
	}

	@Override
	public MemberVO login(MemberVO vo) {
		
		return sqlSession.selectOne("MemberMapper.login", vo);
	}

}
