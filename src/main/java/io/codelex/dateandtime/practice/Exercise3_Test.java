package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class Exercise3_Test {
    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        OverlapPeriod firstPeriod = new OverlapPeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        OverlapPeriod secondPeriod = new OverlapPeriod(secondStart, secondEnd);

        OverlapPeriod overlap = firstPeriod.intersection(secondPeriod);

        if (overlap != null) {
            System.out.println("Periods: " + firstStart + " " + firstEnd + " and " + secondStart + " " + secondEnd);
            System.out.println("Overlap between periods start from " + overlap.getStart() + " to " + overlap.getEnd());
        } else {
            System.out.println("Periods do not overlap!");
        }

    }
}
