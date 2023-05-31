package io.codelex.oop.Runners;

public class Runners_Test {
    public static void main(String[] args) {
        int marathonTime = 47;

        Runner fitnessLevel = Runner.getFitnessLevel(marathonTime);
        System.out.println("Fitness level: " + fitnessLevel);
    }
}
