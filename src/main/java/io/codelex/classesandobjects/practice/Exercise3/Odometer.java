package io.codelex.classesandobjects.practice.Exercise3;

// JAUTĀJUMS PAR UZD. NOBEIGUMU;
public class Odometer {
    private int currentMileage;

    public int reportCurrentMileage() {
        return currentMileage;
    }

    public void incrementMileage() {
        if (currentMileage < 999999) {
            currentMileage++;
        } else {
            currentMileage = 0;
            currentMileage++;
        }
    }

    // To be able to work with a FuelGauge object. It should decrease the FuelGauge object’s current amount of fuel by 1 liter for every 10 kilometers traveled. (The car’s fuel economy is 10 kilometers per liter.) Kā???


    public Odometer(int currentMileage) {
        this.currentMileage = currentMileage;
    }
}

