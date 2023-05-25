package io.codelex.Objects_Additional.Exercise2;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String inputColor, int inputDuration) {
        this.color = inputColor;
        this.duration = inputDuration;
    }

    public void changeColor(String inputColor, int inputDuration) {
        this.color = inputColor;
        this.duration = inputDuration;
    }

    public boolean isRead() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }
}
