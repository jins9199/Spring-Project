package org.js.movie.auth.domain;


import java.util.List;

import org.js.movie.member.domain.MemberVO;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class CustomMember implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private String username; //memberVO의 id pw에 해당하지만 변수명은 다름. UserDetails에 정의된것을 MemberVO로 생성자를 통해서 이동.
    private String password; //처음엔 memberID memberPW로 했다가 unimplemented methods가 떠서 수정함.
    
	//Spring security fields
	private boolean enabled = true;
	private List<RoleVO> authorities;
	private boolean accountNonExpired = true;
	private boolean accountNonLocked = true;
	private boolean credentialsNonExpired = true;

	
	public CustomMember(MemberVO mvo) {
		this.username= mvo.getMemberID();
		this.password = mvo.getMemberPW();
		this.enabled = mvo.getEnabled()==1? true : false;
	}
}
