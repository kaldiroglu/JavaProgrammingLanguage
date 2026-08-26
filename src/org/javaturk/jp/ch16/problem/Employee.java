package org.javaturk.jp.ch16.problem;

import java.time.LocalDate;

class Employee {
	int id;
	String firstName;
	String lastName;
	LocalDate birthDate;
	float salary;
//	String department;
	String department = "No department yet!";

	Employee(int newId, String newFirstName, String newLastName, LocalDate newBirthDate, float newSalary,
					String newDepartment) {
		id = newId;
		firstName = newFirstName;
		lastName = newLastName;
		birthDate = newBirthDate;
		salary = newSalary;
		department = newDepartment;
	}

	Employee(int newId, String newFirstName, String newLastName, LocalDate newBirthDate, float newSalary) {
		id = newId;
		firstName = newFirstName;
		lastName = newLastName;
		birthDate = newBirthDate;
		salary = newSalary;
//		department = "No department yet!";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ali", "Ozgun", LocalDate.of(2001, 9, 11), 64_000.00f, "Production");

//		Employee e2 = new Employee(1, "Ali", "Ozgun", LocalDate.of(2001, 9, 11), 64_000.00f, null);
		// The other constructor should be called instead of passing `null`
//		Employee e3 = new Employee(1, "Ali", "Ozgun", LocalDate.of(2001, 9, 11), 64_000.00f);
	}
}




