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

		return memberDAO.selectAllMember();
	}

	@Override
	public void insertMember(MemberVO vo) {

		memberDAO.insertMember(vo);
	}

	@Override
	public MemberVO selectOneMember(String memberId) {

		return memberDAO.selectOneMember(memberId);
	}

	@Override
	public void updateMember(MemberVO vo) {

		memberDAO.updateMember(vo);
	}

	@Override
	public void deleteMember(String memberId) {

		memberDAO.deleteMember(memberId);
	}

	@Override
	public MemberVO login(MemberVO vo) {
		
		return memberDAO.login(vo);
	}

}
