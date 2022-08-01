package com.ezdesign.project;

import java.util.LinkedList;

public class Privileges {
	
	private LinkedList privileges;
	
	public Privileges(String firstname, String lastname) {
		this.privileges = new LinkedList();
		privileges.add("포스트를 붙일 수 있다.");
		privileges.add("포스트를 삭제할 수 있다.");
		privileges.add("사용자를 막을 수 있다.");
	}
	
	public void showPrivileges(String firstname, String lastname) {
		System.out.println("<< "+firstname+lastname+" 관리자 목록 >>");
		for(int i=0; i<privileges.size(); i++)
			System.out.println(privileges.get(i));
	}
}