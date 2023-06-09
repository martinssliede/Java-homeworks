package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person{

    private double gpa;
    public Student(String firstName, String lastName, String address, int idNumber, double gpa) {
        super(firstName, lastName, address, idNumber);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(getGpa());
    }
}
