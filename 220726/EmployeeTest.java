package java_220726;

import java.util.LinkedList;

public class EmployeeTest {
	private  static LinkedList catalog = new LinkedList();
	private  static LinkedList catalog1 = new LinkedList();
	
	public void addEmployee(String name,int workHours) {
		Employee emp = new Employee(name, workHours);
		catalog.add(emp); // 만든 객체를 카탈로그 리스트에 넣는다.
	}
	
	public void addProgrammer(String name,int workHours, int overTimes) {
		Programmer pro = new Programmer(name, workHours, overTimes);
		catalog1.add(pro); // 만든 객체를 카탈로그 리스트에 넣는다.
	}
	
	public int getSize() {
		return catalog.size(); // 리스트 안에 들은 갯수 말하는듯?
	}
	
	public int getSize1() {
		return catalog1.size(); // 리스트 안에 들은 갯수 말하는듯?
	}
	
    public Employee getItem(int i) {
        return (Employee) catalog.get(i); // 이건 리스트에서 객체를 하나씩 꺼내는 용도
    }
    
    public Employee getItem1(int i) {
        return (Employee) catalog1.get(i); // 이건 리스트에서 객체를 하나씩 꺼내는 용도
    }
	
	public static void main(String[] args) {
		EmployeeTest employee = new EmployeeTest();
		
		employee.addEmployee("A", 40);
		employee.addEmployee("B", 40);
		employee.addEmployee("C", 50);

		for(int i=0; i<employee.getSize();i++) {
			Employee show = (Employee) employee.getItem(i);
			
            System.out.println("\nName: " + show.getname() + "\nSalary: " + show.getSalary()+ "\nworkHoursPerWeek: "+show.getworkhours()+"Hours/week");
		}
		
       EmployeeTest programmer = new EmployeeTest();
       
       employee.addProgrammer("D", 40, 10);
       employee.addProgrammer("E", 40, 20);
       
       for(int j=0; j<programmer.getSize1();j++) {
    	   Programmer show1 = (Programmer) programmer.getItem1(j);
    	   System.out.println(show1);
    	   System.out.println("\nName: " + show1.getname() + "\nSalary: " + show1.getSalary()+ "\nworkHoursPerWeek: "+show1.getworkhours()+"Hours/week\nOverTimes: "
    			   			+show1.getOverTimes()+"Hours");
    	   
       }
	}
 }
