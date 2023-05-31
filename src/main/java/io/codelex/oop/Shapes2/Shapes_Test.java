package io.codelex.oop.Shapes2;

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

        System.out.println();

        Hexagon hexagon = new Hexagon(6, 5);
        System.out.println("Hexagon perimeter: ");
        hexagon.getPerimeter();
        System.out.println("Hexagon area: ");
        hexagon.getArea();

        System.out.println();
        Cone cone = new Cone(2, 10, 15);
        System.out.println("Cone volume is: ");
        cone.calculateVolume();

        System.out.println();
        Cube cube = new Cube(6, 5);
        System.out.println("Cube volume is: ");
        cube.calculateVolume();


    }
}
