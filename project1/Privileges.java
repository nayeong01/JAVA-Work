package project;

import java.util.LinkedList;

public class Privileges {
	
	private LinkedList privileges;
	
	public Privileges(String firstname, String lastname) {
		this.privileges = new LinkedList();
		privileges.add("����Ʈ�� ���� �� �ִ�.");
		privileges.add("����Ʈ�� ������ �� �ִ�.");
		privileges.add("����ڸ� ���� �� �ִ�.");
		

	}
	
	public void showPrivileges(String firstname, String lastname) {
		System.out.println("<< "+firstname+lastname+" ������ ���� ���>>");
		for(int i=0; i<privileges.size(); i++)
			System.out.println(privileges.get(i));
	}
}
