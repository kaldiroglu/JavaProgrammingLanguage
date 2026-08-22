package org.javaturk.jp.ch16.overloaded;

import java.time.LocalDate;

class Employee {

    int id;
    String firstName;
    String lastName;
    LocalDate birthDate;
    float salary;
    String department = "No department yet!";
    String phone = "";
    Address address;

    Employee(int newId, String newFirstName, String newLastName, LocalDate newBirthDate, float newSalary, String newDepartment, String newPhone, Address newAddress) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        birthDate = newBirthDate;
        salary = newSalary;
        department = newDepartment;
        phone = newPhone;
        address = newAddress;
    }

    Employee(int newId, String newFirstName, String newLastName, LocalDate newBirthDate, float newSalary) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        birthDate = newBirthDate;
        salary = newSalary;
    }
}

class Address {

}