package io.codelex.oop.Shapes2;

public class Hexagon extends Shape{
    private int length;

    public Hexagon(int numSides, int length) {
        super(numSides);
        this.length = length;
    }


    @Override
    public void getArea() {
        double area = ((3 * Math.sqrt(3)) / 2) * (length * length);
        System.out.println(area);
    }

    @Override
    public void getPerimeter() {
        System.out.println(6 * length);
    }
}
