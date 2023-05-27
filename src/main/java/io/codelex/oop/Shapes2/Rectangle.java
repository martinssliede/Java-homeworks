package io.codelex.oop.Shapes2;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int numSides, int width, int height) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println(width * height);
    }

    @Override
    public void getPerimeter() {
        System.out.println((2 * width) + (2 * height));
    }
}
