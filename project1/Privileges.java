package com.ezdesign.project;

import java.util.LinkedList;

public class Privileges {
	
	private String[] privileges;
	
	public Privileges() {
		this.privileges = new String[]{"포스트를 붙일 수 있다","포스트를 삭제할 수 있다","사용자를 막을 수 있다."};
	}
	
	public void showPrivileges() {
		//System.out.println("<< "+firstname+lastname+" 관리자 목록 >>");
		for(int i=0; i<privileges.length; i++)
			System.out.println(privileges[i]);
	}
}