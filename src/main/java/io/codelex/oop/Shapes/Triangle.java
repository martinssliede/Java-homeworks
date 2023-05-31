package io.codelex.oop.Shapes;

import java.text.DecimalFormat;

public class Triangle extends Shape{
    private int width;
    private int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }


    @Override
    public void getArea() {
        System.out.println((width * height) / 2);
    }

    @Override
    public void getPerimeter() {
        double c = Math.sqrt((height * height) + (width * width));
        System.out.println(width + height + c);
    }
}
