package programs;

import java.time.LocalDate;

//EmployeeAmirTask create class 
//fields are below:
//int id;
//String name create a list of 10 employees
//date of birth(yyyy-mm-dd)
//find age
//isActive
class EmployeeAmirTask {
	int id;
	String name;
	LocalDate dob;
	int age;
	boolean isActive;
}

public class Pr8 {

	public static void main(String[] args) {

		EmployeeAmirTask e1 = new EmployeeAmirTask();
		EmployeeAmirTask e2 = new EmployeeAmirTask();
		EmployeeAmirTask e3 = new EmployeeAmirTask();
		EmployeeAmirTask e4 = new EmployeeAmirTask();
		EmployeeAmirTask e5 = new EmployeeAmirTask();
		EmployeeAmirTask e6 = new EmployeeAmirTask();
		EmployeeAmirTask e7 = new EmployeeAmirTask();
		EmployeeAmirTask e8 = new EmployeeAmirTask();
		EmployeeAmirTask e9 = new EmployeeAmirTask();
		EmployeeAmirTask e10 = new EmployeeAmirTask();

		e1.id = 1;
		e2.id = 2;
		e3.id = 3;
		e4.id = 4;
		e5.id = 5;
		e6.id = 6;
		e7.id = 7;
		e8.id = 8;
		e9.id = 9;
		e10.id = 10;

		e1.name = "Suhail";
		e2.name = "Abrar";
		e3.name = "Abdul";
		e4.name = "Abhishek";
		e5.name = "faiz";
		e6.name = "yasir";
		e7.name = "Aadil";
		e8.name = "Sameer";
		e9.name = "Moeen";
		e10.name = "ahmad";

		e1.dob = LocalDate.of(2000, 01, 01);
		e2.dob = LocalDate.of(2001, 01, 01);
		e3.dob = LocalDate.of(2002, 01, 01);
		e4.dob = LocalDate.of(2003, 01, 01);
		e5.dob = LocalDate.of(2004, 01, 01);
		e6.dob = LocalDate.of(2005, 01, 01);
		e7.dob = LocalDate.of(2006, 01, 01);
		e8.dob = LocalDate.of(2007, 01, 01);
		e9.dob = LocalDate.of(2008, 01, 01);
		e10.dob = LocalDate.of(2009, 01, 01);

		e1.isActive = true;
		e2.isActive = true;
		e3.isActive = true;
		e4.isActive = true;
		e5.isActive = true;
		e6.isActive = true;
		e7.isActive = true;
		e8.isActive = true;
		e9.isActive = true;
		e10.isActive = true;

		EmployeeAmirTask[] list = { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 };

		for (int i = 0; i < list.length; i++) {

			System.out.println(
					list[i].id + " " + list[i].name + " " + list[i].dob + " " + list[i].age + " " + list[i].isActive);
			if (list[i].isActive == true) {
				System.out.println(list[i].name + " is active");
			} else {
				System.out.println(list[i].name + " is not active");
			}
		}
	}
}