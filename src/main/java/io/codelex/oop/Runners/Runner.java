package io.codelex.oop.Runners;

public enum Runner {
    BEGINNER(60, 90),
    INTERMEDIATE(45, 60),
    ADVANCED(30, 45);

    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int marathonTime) {
        for (Runner runner : Runner.values()) {
            if (marathonTime >= runner.minTime && marathonTime <= runner.maxTime) {
                return runner;
            }
        }
        throw new IllegalArgumentException("Invalid marathon time: " + marathonTime);
    }
}
