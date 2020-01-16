package org.js.movie.member.domain;

public class MemberVO {

	private String nickname;
	private String memberID;
	private String memberPW;
	private String email;
	private String phoneNum;
	private int id;
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the memberID
	 */
	public String getMemberID() {
		return memberID;
	}
	/**
	 * @param memberID the memberID to set
	 */
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	/**
	 * @return the memberPW
	 */
	public String getMemberPW() {
		return memberPW;
	}
	/**
	 * @param memberPW the memberPW to set
	 */
	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone_num
	 */
	public String getPhoneNum() {
		return phoneNum;
	}
	/**
	 * @param phone_num the phone_num to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "MemberVO [nickname=" + nickname + ", memberID=" + memberID + ", memberPW=" + memberPW + ", email="
				+ email + ", phoneNum=" + phoneNum + ", id=" + id + "]";
	}

	
}
	
	