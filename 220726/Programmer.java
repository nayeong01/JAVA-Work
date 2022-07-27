package java_220726;

import java.util.LinkedList;

public class Programmer extends Employee {

	private int overTimeHoursPerWeek;
	
	public Programmer(String name, int workHoursPerWeek, int overTimes){
		super(name, workHoursPerWeek);
		this.overTimeHoursPerWeek = overTimes;
		this.salary = this.calcSalary(overTimes);
		//System.out.println(salary);
	}
	
	public int calcSalary(int overTimes) {
		return super.getSalary() + overTimes * 100000;
	}
	
	
    public int getOverTimes() {
        return overTimeHoursPerWeek;
    }
}
	
