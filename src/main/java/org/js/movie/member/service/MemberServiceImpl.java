package org.js.movie.member.service;

import java.util.List;

import org.js.movie.member.dao.MemberDAO;
import org.js.movie.member.domain.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service("memberService")
@Slf4j
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public List<MemberVO> selectAllMember() {
		// TODO Auto-generated method stub
		return memberDAO.selectAllMember();
	}

	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		memberDAO.insertMember(vo);
	}

	@Override
	public MemberVO selectOneMember(String memberID) {
		// TODO Auto-generated method stub
		return memberDAO.selectOneMember(memberID);
	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
		memberDAO.updateMember(vo);
	}

	@Override
	public void deleteMember(String memberID) {
		// TODO Auto-generated method stub
		memberDAO.deleteMember(memberID);
	}

//	@Override
//	public boolean isMember(String memberID, String memberPW) {
//		// TODO Auto-generated method stub
//		return false;
	
	@Override
	public MemberVO login(MemberVO vo) {
		return memberDAO.login(vo);
	}

}
