package com.ezdesign.task1;

public class Programmer extends Employee {
	
	protected int overTimeHours;

	public Programmer(String name, int workHoursPerWeek, int overtimeHours) {
		super(name, workHoursPerWeek);
		this.overTimeHours = overtimeHours;
		this.salary = super.salary + overtimeHours * 20000;
	}
}

class DatabaseProgrammer extends Programmer {
	public DatabaseProgrammer(String name, int workHoursPerWeek, int overtimeHours) {
		super(name, workHoursPerWeek, overtimeHours);
	}
}

class SystemProgrammer extends Programmer {
	public SystemProgrammer(String name, int workHoursPerWeek, int overtimeHours) {
		super(name, workHoursPerWeek, overtimeHours);
	}
}

class ApplicationProgrammer extends Programmer {
	public ApplicationProgrammer(String name, int workHoursPerWeek, int overtimeHours) {
		super(name, workHoursPerWeek, overtimeHours);
	}
}

