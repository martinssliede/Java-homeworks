package io.codelex.arithmetic.practice;

public class Exercise9 {
    public static void main(String[] args) {
        double heightMeters = 1.90;
        double weightKilograms = 80;

        float resultBMI = (float) (weightKilograms / (heightMeters * heightMeters));

        if (resultBMI < 18.5) {
            System.out.printf("Your BMI is: %.2f. You are underweight!", resultBMI);
        } else if (resultBMI > 25) {
            System.out.printf("Your BMI is: %.2f. You are overweight!", resultBMI);
        } else {
            System.out.printf("Your BMI is: %.2f. It is optimal!", resultBMI);
        }
    }
}
