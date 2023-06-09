package io.codelex.polymorphism.practice.exercise3;

public class Person_Test {
    public static void main(String[] args) {
        Student student = new Student("Peter", "Brown", "Lake street 2", 1875, 99.9);
        Employee employee = new Employee("Jim", "Rodgers", "Oak road 66", 19722, "Carpenter");

        student.display();
        employee.display();
    }
}
