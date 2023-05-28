package io.codelex.oop.Persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person{
    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String position, String id, int age, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }


    public int getWorkExperience() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(startedWorking, currentDate);
        return period.getYears();
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + position + " (" + getWorkExperience() + " years)";
    }

    public String getPosition() {
        return position;
    }

}
