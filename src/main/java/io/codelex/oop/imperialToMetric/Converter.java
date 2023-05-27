package io.codelex.oop.imperialToMetric;

public interface Converter {
    double convert(int value);
}
//  Vai klases tiek veidotas pareizi?
 class MeterToYardConverter implements Converter {
    private static double METERS_TO_YARDS = 1.09361;


    @Override
    public double convert(int value) {
        return value * METERS_TO_YARDS;
    }
}

class YardToMeterConverter implements Converter {
    private static double YARDS_TO_METERS = 0.9114;
    @Override
    public double convert(int value) {
        return value * YARDS_TO_METERS;
    }
}

class CentimetersToInches implements Converter {
    private static double CENTIMETERS_TO_INCHES = 0.3937;
    @Override
    public double convert(int value) {
        return value * CENTIMETERS_TO_INCHES;
    }
}

class InchesToCentimeters implements Converter {
    private static double INCHES_TO_CENTIMETERS = 2.54;
    @Override
    public double convert(int value) {
        return value * INCHES_TO_CENTIMETERS;
    }
}

class KilometersToMiles implements Converter {
    private static double KILOMETERS_TO_MILES = 0.6213;
    @Override
    public double convert(int value) {
        return value * KILOMETERS_TO_MILES;
    }
}

class MilesToKilometers implements Converter {
    private static double MILES_TO_KILOMETERS = 1.6093;
    @Override
    public double convert(int value) {
        return value * MILES_TO_KILOMETERS;
    }
}


