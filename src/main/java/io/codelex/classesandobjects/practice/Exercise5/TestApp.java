package io.codelex.classesandobjects.practice.Exercise5;

public class TestApp {
    public static void main(String[] args) {
        Date myDate = new Date(14, 05, 2023);
        System.out.print("Date: ");
        myDate.displayDate();

        myDate.setDay(15);
        myDate.setMonth(06);
        myDate.setYear(2024);
        System.out.print("Updated date: ");
        myDate.displayDate();
    }
}
