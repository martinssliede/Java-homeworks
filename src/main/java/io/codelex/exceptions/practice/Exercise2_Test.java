package io.codelex.exceptions.practice;

public class Exercise2_Test {
    public static void main(String[] args) {

        Exercise2 methodA = new Exercise2();

        try {
            methodA.methodC();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            methodA.methodC();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            methodA.methodC();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
