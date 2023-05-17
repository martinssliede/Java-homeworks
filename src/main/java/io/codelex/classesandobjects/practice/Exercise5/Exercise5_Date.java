package io.codelex.classesandobjects.practice.Exercise5;

public class Exercise5_Date {
    private int month;
    private int day;
    private int year;

    public Exercise5_Date( int day, int month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}