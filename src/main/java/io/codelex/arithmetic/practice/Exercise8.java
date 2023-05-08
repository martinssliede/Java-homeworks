package io.codelex.arithmetic.practice;
// Aktivizē lietotāja input opciju

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // Izveido jaunu scanner
        Scanner scanner = new Scanner(System.in);
        // Izveido dialogu
        System.out.print("Enter hourly rate: ");
        float rate = scanner.nextFloat();
        System.out.print("Enter hours worked: ");
        int hours = scanner.nextInt();

        float totalPay = rate * hours;

        if (rate < 8.00 && hours > 60) {
            System.out.println("Your hourly rate is too low and you work too much!");
        } else if (rate < 8.00) {
            System.out.println("Hourly rate too low! Demand a raise!");
        } else if (hours > 60) {
            System.out.println("You can't work that much!");
        } else if (hours > 40) {
            int overtimeHours = hours - 40;
            float overtimePay = (float) (overtimeHours * 1.5);
            System.out.println("Your total salary is: $ " + (totalPay + overtimePay));
        } else {
            System.out.println("Your total salary is: $ " + totalPay);
        }
    }
}
