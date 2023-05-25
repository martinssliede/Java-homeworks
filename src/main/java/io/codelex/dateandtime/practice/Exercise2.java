package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        LocalDate launchDate = LocalDate.of(2023, 5, 1);
        int year = 2023;
        Month month = Month.MAY;

        List <LocalDate> updateDates = calculateServerUpdateDates(launchDate, year, month);
        System.out.println("Server update dates in " + month + " " + year + ": ");
        for (LocalDate date : updateDates) {
            System.out.println(date);
        }
    }
    public static List<LocalDate> calculateServerUpdateDates(LocalDate launchDate, int year, Month month) {
        List<LocalDate> updateDates = new ArrayList<>();
        LocalDate currentDate = launchDate.plusDays(14);

        while (currentDate.getMonth() == month) {
            updateDates.add(currentDate);
            currentDate = currentDate.plusDays(14);
        }
        return updateDates;
    }
}
