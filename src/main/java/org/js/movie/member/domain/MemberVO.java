package org.js.movie.member.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class MemberVO {
	
	private String nickname;
	private String memberID;
	private String memberPW;
	private String email;
	private String phoneNum;
	private int id;
	private int enabled;

}
	
	