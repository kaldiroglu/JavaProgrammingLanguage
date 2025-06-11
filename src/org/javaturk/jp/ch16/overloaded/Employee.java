package org.javaturk.ioop.ch17.overloaded;

import java.time.LocalDate;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 * </p>
 */
public class Employee {

    int id;
    String firstName;
    String lastName;
    LocalDate birthDate;
    float salary;
    String department = "No department yet!";
    String phone = "";
    Address address;

    public Employee(int newId, String newFirstName, String newLastName, LocalDate newBirthDate, float newSalary, String newDepartment, String newPhone, Address newAddress) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        birthDate = newBirthDate;
        salary = newSalary;
        department = newDepartment;
        phone = newPhone;
        address = newAddress;
    }

    public Employee(int newId, String newFirstName, String newLastName, LocalDate newBirthDate, float newSalary) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        birthDate = newBirthDate;
        salary = newSalary;
    }
}

class Address {

}