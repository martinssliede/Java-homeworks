package io.codelex.enums.practice.Exercise1;

public class Directions_Test {
    public static void main(String[] args) {
        Directions north = Directions.NORTH;
        Directions south = Directions.SOUTH;
        Directions east = Directions.EAST;
        Directions west = Directions.WEST;

        System.out.println(north + " " + north.getText());
        System.out.println(south + " " + south.getText());
        System.out.println(east + " " + east.getText());
        System.out.println(west + " " + west.getText());

        System.out.println();
        System.out.println(north + ":" + north.getText() + ":" + north.ordinal());
        System.out.println(south + ":" + south.getText() + ":" + south.ordinal());
        System.out.println(east + ":" + east.getText() + ":" + east.ordinal());
        System.out.println(west + ":" + west.getText() + ":" + west.ordinal());

    }
}
