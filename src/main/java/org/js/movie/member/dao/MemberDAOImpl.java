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
		// TODO Auto-generated method stub
		return sqlSession.selectList("MemberMapper.selectAllMember");
	}

	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert("MemberMapper.insertMember", vo);
	}

	@Override
	public MemberVO selectOneMember(String memberID) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("MemberMapper.selectOneMember");
	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.update("MemberMapper.updateMember", vo);
	}

	@Override
	public void deleteMember(String memberID) {
		// TODO Auto-generated method stub
		sqlSession.delete("MemberMapper.deleteMember");
	}

//	@Override
//	public boolean isMember(String memberID, String memberPW) {
//		// TODO Auto-generated method stub
//		
//		return false;
//	}
	
	@Override
	public MemberVO login(MemberVO vo) {
		return sqlSession.selectOne("MemberMapper.login", vo);
	}


}
