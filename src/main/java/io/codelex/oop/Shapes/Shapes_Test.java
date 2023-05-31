package io.codelex.oop.Shapes;

public class Shapes_Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 20, 30);
        System.out.println("Rectangle perimeter: ");
        rectangle.getPerimeter();
        System.out.println("Rectangle area: ");
        rectangle.getArea();

        System.out.println();
        Triangle triangle = new Triangle(3, 20, 30);
        System.out.println("Triangle perimeter: ");
        triangle.getPerimeter();
        System.out.println("Triangle area: ");
        triangle.getArea();
    }
}
