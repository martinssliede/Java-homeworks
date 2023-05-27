package io.codelex.oop.Shapes2;

public class Cube extends ThreeDShape {
    private int length;

    public Cube(int numSides, int length) {
        super(numSides);
        this.length = length;
    }


    @Override
    public void calculateVolume() {
        System.out.println(Math.pow(length, 3));
    }

    @Override
    public void getArea() {

    }

    @Override
    public void getPerimeter() {

    }
}
