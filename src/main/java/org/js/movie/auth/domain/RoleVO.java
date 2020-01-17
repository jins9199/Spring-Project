package org.js.movie.auth.domain;

import org.springframework.security.core.GrantedAuthority;

public class RoleVO implements GrantedAuthority { 
	
	private static final long serialVersionUID = 7464267597005842862L;
	
	private String memberID;
	private String role;
	
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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.role;
	}

}

