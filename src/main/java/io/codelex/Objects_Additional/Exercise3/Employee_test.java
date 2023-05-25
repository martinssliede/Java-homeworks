package io.codelex.Objects_Additional.Exercise3;

import java.time.LocalDate;

public class Employee_test {
    public static void main(String[] args) {
        LocalDate hireDate = LocalDate.of(2002, 4, 15);
        Employee employee = new Employee("George", 123.45, hireDate);

        String name = employee.getName();
        double salary = employee.getSalary();
        LocalDate dateHired = employee.getHireDate();
        int service = employee.calculateYearsOfService();

        System.out.println("My name is " + name);
        System.out.printf("I earn: %.2f$ a month\n", salary);
        System.out.println("I was hired back in " + dateHired);
        System.out.println("I have worked in this company for " + service + " years!");
    }
}
