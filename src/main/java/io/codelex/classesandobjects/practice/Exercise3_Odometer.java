package io.codelex.classesandobjects.practice;

public class Exercise3_Odometer {
    private int currentMileage;

    String reportCurrentMileage() {
        return ("Current mileage is: " + currentMileage);
    }

    public void incrementMileage() {
        if (currentMileage < 999999) {
            currentMileage += 1;
        } else {
            currentMileage = 0;
        }
    }
}
