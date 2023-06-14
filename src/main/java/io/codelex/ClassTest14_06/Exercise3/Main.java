package io.codelex.ClassTest14_06.Exercise3;

public class Main {
    public static void main(String[] args) {
        Joiner<Integer> joiner = new Joiner<>("-");

        String joinedNumbers = joiner.join(1,2,3,4,5);
        System.out.println(joinedNumbers);
    }
}
