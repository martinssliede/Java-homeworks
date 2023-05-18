package io.codelex.classesandobjects.practice.Exercise6;

import io.codelex.NoCodeWrittenException;


public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);

        System.out.println("Approximately " + calculateEnergyDrinkers(NUMBERED_SURVEYED) + " bought at least one energy drink");

        System.out.println(calculatePreferCitrus(NUMBERED_SURVEYED) + " of those " + "prefer citrus flavored energy drinks.");

        //fixme
        //System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        //System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        //System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return NUMBERED_SURVEYED * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitrus(int numberSurveyed) {
        return NUMBERED_SURVEYED * PREFER_CITRUS_DRINKS;
    }

    public int getNUMBERED_SURVEYED() {
        return NUMBERED_SURVEYED;
    }

    public double getPURCHASED_ENERGY_DRINKS() {
        return PURCHASED_ENERGY_DRINKS;
    }

    public double getPREFER_CITRUS_DRINKS() {
        return PREFER_CITRUS_DRINKS;
    }


}
