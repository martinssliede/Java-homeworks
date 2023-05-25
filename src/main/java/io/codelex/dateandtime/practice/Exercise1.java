package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Exercise1 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023,5, 23);

        int totalHours = calculateWorkingHours(startDate, endDate);
        System.out.println("Total working hours in this period: " + totalHours);
    }
    public static int calculateWorkingHours(LocalDate startDate, LocalDate endDate) {
        int totalHours = 0;
        LocalDate currentDate = startDate;
        while (currentDate.isBefore(endDate) || currentDate.isEqual(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                totalHours += 8;
            }
            currentDate = currentDate.plusDays(1);
        }
        return totalHours;
    }
}
