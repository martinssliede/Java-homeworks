package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    final int NUMBERED_SURVEYED = 12467;
    final double PURCHASED_ENERGY_DRINKS = 0.14;
    final double PREFER_CITRUS_DRINKS = 0.64;


    public static void main(String[] args) {
        EnergyDrinks statistics = new EnergyDrinks();
        statistics.getNUMBERED_SURVEYED();
        statistics.getPURCHASED_ENERGY_DRINKS();
        statistics.getPREFER_CITRUS_DRINKS();

        System.out.println("Total number of people surveyed: " + statistics.getNUMBERED_SURVEYED());
//        System.out.println("Approximately " +  + " bought at least one energy drink.");

        //fixme
        //System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        //System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        //System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {throw new NoCodeWrittenException();
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
