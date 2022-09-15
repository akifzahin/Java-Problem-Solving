package com.AkifZahin.Lab_Exercises.Assignment1_Theory;


public class OfficeAdmin extends Employee 
{
	private int overtime_hours;
	private int hourly_rate;
	
	
	
	
	public OfficeAdmin(String name, int base_salary, int overtime_hours, int hourly_rate) {
		super(name, base_salary);
		this.overtime_hours = overtime_hours;
		this.hourly_rate = hourly_rate;
	}




	public int getOvertime_hours() {
		return overtime_hours;
	}




	public void setOvertime_hours(int overtime_hours) {
		this.overtime_hours = overtime_hours;
	}




	public int getHourly_rate() {
		return hourly_rate;
	}




	public void setHourly_rate(int hourly_rate) {
		this.hourly_rate = hourly_rate;
	}


	 public boolean addOvertimeHours(int val)
	 {
		 boolean isAdded = false;
		 int result = this.overtime_hours+val;
			
			if(result<=50)
			{
				this.overtime_hours=result;
				isAdded = true;
			}
			else
			{
				System.out.println("Overtime Hours for " +getName() +" exceeded!");
			}
			return isAdded;
	 }
	
	 public boolean deleteOvertimeHours(int val)
	 {
		 boolean isDeleted = false;
		 int result = this.overtime_hours-val;
			
			if(result>0)
			{
				this.overtime_hours=result;
				isDeleted =  true;
			}
			else
			{
				System.out.println("Overtime hours cannot be 0 for "+getName());
			}
			return isDeleted;
	 }

	@Override
	public int salary() {
		return getBase_salary()+(overtime_hours*hourly_rate);
	}

	


	


	







	

}
