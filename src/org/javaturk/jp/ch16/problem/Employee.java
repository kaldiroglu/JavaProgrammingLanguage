package org.javaturk.ioop.ch17.problem;

import java.time.LocalDate;

public class Employee {

	int id;
	String firstName;
	String lastName;
	LocalDate birthDate;
	float salary;
	String department = "No department yet!";
//	String department;

	public Employee(int newId, String newFirstName, String newLastName, LocalDate newBirthDate, float newSalary,
					String newDepartment) {
		id = newId;
		firstName = newFirstName;
		lastName = newLastName;
		birthDate = newBirthDate;
		salary = newSalary;
		department = newDepartment;
	}

//	public Employee(int newId, String newFirstName, String newLastName, LocalDate newBirthDate, float newSalary) {
//		id = newId;
//		firstName = newFirstName;
//		lastName = newLastName;
//		birthDate = newBirthDate;
//		salary = newSalary;
//		department = "No department yet!";
//	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ali", "Ozgun", LocalDate.of(2001, 9, 11), 14_000.00f, null);
		// null geçmek yerine diğer kurucu çağrılmalı
//		Employee e2 = new Employee(1, "Ali", "Ozgun", LocalDate.of(2001, 9, 11), 14_000.00f);

		Employee e3 = new Employee(1, "Ali", "Ozgun", LocalDate.of(2001, 9, 11), 14_000.00f, null);
	}
}




