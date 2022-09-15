package com.AkifZahin.Lab_Exercises.Assignment1_Theory;

public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Akif",50000,1,1000);
		Teacher t2 = new Teacher("Aman",40000,3,3000);
		Teacher t3 = new Teacher("Auntorip",35000,2,1900);
		
		OfficeAdmin ad1 = new OfficeAdmin("Russel",70000,45,15);
		OfficeAdmin ad2 = new OfficeAdmin("Sohel",60000,25,18);
		OfficeAdmin ad3 = new OfficeAdmin("Rana",38000,19,9);
		

		t1.addCourse(4);
		t2.addCourse(3);
		t3.addCourse(3);
		
		ad1.addOvertimeHours(10);
		ad2.addOvertimeHours(10);
		ad3.addOvertimeHours(10);
		
		Employee[] employeeArray = {t1,ad1,t2,ad2,t3,ad3};
		
		System.out.println();
		
		System.out.println("Printing employees by increasing salary: \n");
		java.util.Arrays.sort(employeeArray);
		for(int i=0; i<employeeArray.length; i++)
		{
			System.out.println("Name: " +employeeArray[i].getName()+"\nEmployee Type: "+employeeArray[i].getClass().getSimpleName()+" \nSalary: " +employeeArray[i].salary() +"\n") ;
			
		}
		
	}

}
