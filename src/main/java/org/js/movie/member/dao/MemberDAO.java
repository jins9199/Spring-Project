package org.js.movie.member.dao;

import java.util.List;

import org.js.movie.member.domain.MemberVO;


public interface MemberDAO {
	

	//전체 회원 조회
	public List<MemberVO> selectAllMember();
	//회원 가입
	public void insertMember(MemberVO vo);
	//개별 회원 조회
	public MemberVO selectOneMember(String memberID);
	//회원정보 수정
	public void updateMember(MemberVO vo);
	//회원정보 삭제
	public void deleteMember(String memberID);
	//로그인
//	public boolean isMember(String memberID, String memberPW);
	public MemberVO login(MemberVO vo);
	

}