package io.codelex.classesandobjects.practice.Exercise3;

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
            currentMileage += 1;
        }
    }
}

// Kā palaiž šo programmu? Vai jāveido trešā klase ar main metodi, vai tā bija jāliek kādā no šīm divām klasēm?