package io.codelex.enums.practice.Exercise1;

public enum Directions {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String text;
    Directions(String text) {
    this.text = text;
    }

    public String getText() {
        return text;
    }
}
