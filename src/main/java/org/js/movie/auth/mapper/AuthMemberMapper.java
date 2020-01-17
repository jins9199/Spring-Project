package org.js.movie.auth.mapper;

import org.apache.ibatis.annotations.Param;
import org.js.movie.auth.domain.RoleVO;
import org.js.movie.member.domain.MemberVO;

public interface AuthMemberMapper {
	
	MemberVO getMemberByMemberID(String memberID);
	RoleVO getMemberRolesByMemberID(String memberID);
	int hasUsername(String memberID);
	MemberVO loadMemberByMemberID(String memberID);
	void insertMember(@Param("mvo") MemberVO mvo);
	void insertMemberRoles(@Param("memberID") String memberID,
							@Param("role") String role);
	

}