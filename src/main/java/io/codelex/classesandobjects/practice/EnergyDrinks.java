package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    final int NUMBERED_SURVEYED = 12467;
    final double PURCHASED_ENERGY_DRINKS = 0.14;
    final double PREFER_CITRUS_DRINKS = 0.64;


    public static void main(String[] args) {
        EnergyDrinks statistic = new EnergyDrinks();
        statistic.getNUMBERED_SURVEYED();
        statistic.getPURCHASED_ENERGY_DRINKS();
        statistic.getPREFER_CITRUS_DRINKS();

        System.out.println("Total number of people surveyed: " + statistic.getNUMBERED_SURVEYED());
//        System.out.println("Approximately " + );

        //fixme
        //System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        //System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        //System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {

    }

    public static double calculatePreferCitrus(int numberSurveyed) {
        throw new NoCodeWrittenException();
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
