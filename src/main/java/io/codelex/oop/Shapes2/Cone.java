package io.codelex.oop.Shapes2;

public class Cone extends ThreeDShape{
    private int radius;
    private int height;

    public Cone(int numSides, int radius, int height) {
        super(numSides);
        this.radius = radius;
        this.height = height;
    }


    @Override
    public void calculateVolume() {
        double volume = Math.PI * (radius * radius) * ((double) height / 3);
        System.out.println(volume);
    }

    @Override
    public void getArea() {

    }

    @Override
    public void getPerimeter() {

    }
}
