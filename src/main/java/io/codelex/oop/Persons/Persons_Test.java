package io.codelex.oop.Persons;

import java.time.LocalDate;

public class Persons_Test {
    public static void main(String[] args) {
        LocalDate startedWork = LocalDate.of(2020, 9, 14);
        Employee employee = new Employee("John", "Brown", "Accountant", "0", 66, startedWork);

        Customer customer = new Customer("Peter", "Brown", "CID1234", 23, "CID123", 17);

        System.out.println(employee.getInfo());
        System.out.println(customer.getInfo());

        customer.setPurchaseCount(18);
        System.out.println(customer.getPurchaseCount());

    }
}
