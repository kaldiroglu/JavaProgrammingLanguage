package org.javaturk.ioop.ch17;

import java.time.LocalDate;

public class Employee {

    int id;
    String firstName;
    String lastName;
    LocalDate birthDate;
    float salary;

    void work() {
        System.out.println("Employee " + firstName + " " + lastName + " is working.);");
    }

    public Employee(int newId, String newFirstName, String newLastName, LocalDate newBirthDate, float newSalary) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        birthDate = newBirthDate;
        salary = newSalary;
    }

    public static void main(String[] args) {
        Employee e = new Employee(1, "Ali", "Ozgun", LocalDate.of(2001, 9, 11), 14_000.00f);
        e.work();

        // No reference t the object!
        new Employee(2, "Sami", "Telli", LocalDate.of(1994, 2, 3), 28_000.00f).work();
    }
}




