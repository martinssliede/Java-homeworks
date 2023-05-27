package io.codelex.oop.Persons;

import java.time.LocalDate;

public class Persons_Test {
    public static void main(String[] args) {
        LocalDate startedWork = LocalDate.of(2021, 9, 14);
        Employee employee = new Employee("John", "Brown", "Accountant", "0", 66, startedWork);

        Customer customer = new Customer("Peter", "Brown", "CID1234", 23, "123", 17);

        // Kā mainīt, lai varētu būt dažādi parametri konstruktoros? Un kaut kāda iemesla dēļ nestrādā info metodes.

    }
}
