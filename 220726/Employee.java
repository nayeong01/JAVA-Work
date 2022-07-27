package java_220726;

import java.util.LinkedList;

public class Employee {

	private final String name;
	public int salary;
	private int workHoursPerWeek;
	
	public Employee(String nameIn, int workHoursPerWeekIn){
		name = nameIn;
		//salary = Integer.parseInt(salaryIn);
		//workHoursPerWeek = Integer.parseInt(workHourPerWeekIn);
		this.workHoursPerWeek = workHoursPerWeekIn;
		salary = calculateSalary(workHoursPerWeek);
		//System.out.println(salary);
	}
	
	public int calculateSalary(int workHourPerWeek) {
		salary = this.workHoursPerWeek*50000*4;
		//System.out.println(salary);
		return salary;
	}
	
	protected int getSalary() {
		return salary;
	}
	
	public String getname() {
		return name;
	}
	
    public int getworkhours() {
        return this.workHoursPerWeek;
    }


}
