package io.codelex.classesandobjects.practice;

public class Exercise3_FuelGauge {
    private int currentFuel;

    String reportCurrentFuel() {
        return ("Current fuel amount is: " + currentFuel);
    }

    public void oneLiterAdded() {
        if (currentFuel < 70) {
            currentFuel += 1;
        }
    }
    public void oneLiterRemoved() {
        if (currentFuel > 0) {
            currentFuel -= 1;
        }
    }
}
