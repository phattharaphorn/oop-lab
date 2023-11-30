package item_3;

import java.time.LocalDate;
import java.time.Month;

public class item_3 {
    public static void main(String[] args) {

        // Person
        System.out.println("Person");
        Person person = new Person();
        person.name = "Somsak";
        person.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        person.phoneNumber = "012-345-6789";
        person.emailAddress = "somsak@mymail.com";

        System.out.println("Name = " + person.name);
        System.out.println("Address = " + person.address);
        System.out.println("Phone Number = " + person.phoneNumber);
        System.out.println("Email Address = " + person.emailAddress);
        System.out.println(person.toString());
        System.out.println();

        // Student
        System.out.println("Student");
        Student student = new Student();
        student.name = "Somsak";
        student.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        student.phoneNumber = "012-345-6789";
        student.emailAddress = "somsak@mymail.com";

        System.out.println("Name = " + student.name);
        System.out.println("Address = " + student.address);
        System.out.println("Phone Number = " + student.phoneNumber);
        System.out.println("Email Address = " + student.emailAddress);
        System.out.println(student.toString());
        System.out.println();

        // Employee
        System.out.println("Employee");
        Employee employee = new Employee();
        employee.name = "Somsak";
        employee.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        employee.phoneNumber = "012-345-6789";
        employee.emailAddress = "somsak@mymail.com";
        employee.office = "KMITL";
        employee.salary = 20000;
        employee.dateHired = LocalDate.of(1998, Month.FEBRUARY, 21);

        System.out.println("Name = " + employee.name);
        System.out.println("Address = " + employee.address);
        System.out.println("Phone Number = " + employee.phoneNumber);
        System.out.println("Email Address = " + employee.emailAddress);
        System.out.println(employee.toString());
        System.out.println();

        // Faculty
        System.out.println("Faculty");
        Faculty faculty = new Faculty();
        faculty.name = "Somsak";
        faculty.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        faculty.phoneNumber = "012-345-6789";
        faculty.emailAddress = "somsak@mymail.com";
        faculty.office = "KMITL";
        faculty.salary = 20000;
        faculty.dateHired = LocalDate.of(1998, Month.FEBRUARY, 21);
        faculty.officeHours = 8;
        faculty.rank = "officer";

        System.out.println("Name = " + faculty.name);
        System.out.println("Address = " + faculty.address);
        System.out.println("Phone Number = " + faculty.phoneNumber);
        System.out.println("Email Address = " + faculty.emailAddress);
        System.out.println(faculty.toString());
        System.out.println();

        //Staff
        System.out.println("Staff");
        Staff staff = new Staff();
        staff.name = "Somsak";
        staff.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        staff.phoneNumber = "012-345-6789";
        staff.emailAddress = "somsak@mymail.com";
        staff.office = "KMITL";
        staff.salary = 20000;
        staff.dateHired = LocalDate.of(1998, Month.FEBRUARY, 21);
        staff.title = "Title";

        System.out.println("Name = " + staff.name);
        System.out.println("Address = " + staff.address);
        System.out.println("Phone Number = " + staff.phoneNumber);
        System.out.println("Email Address = " + staff.emailAddress);
        System.out.println(staff.toString());
        System.out.println();
    }
}