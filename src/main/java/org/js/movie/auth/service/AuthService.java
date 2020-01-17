package org.js.movie.auth.service;

import org.js.movie.member.domain.MemberVO;

public interface AuthService {

	boolean hasUsername(String username);
	void insertUsers(MemberVO mvo, String role);
}
