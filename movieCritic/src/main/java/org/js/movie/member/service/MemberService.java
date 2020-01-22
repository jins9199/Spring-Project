package org.js.movie.member.service;

import java.util.List;

import org.js.movie.member.domain.MemberVO;

public interface MemberService {
	public List<MemberVO> selectAllMember();
	//회원 가입
	public void insertMember(MemberVO vo);
	//개별 회원 조회
	public MemberVO selectOneMember(String memberId);
	//회원정보 수정
	public void updateMember(MemberVO vo);
	//회원정보 삭제
	public void deleteMember(String memberId);
	//로그인
	public MemberVO login(MemberVO vo);
	
}
