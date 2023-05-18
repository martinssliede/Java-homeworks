package io.codelex.classesandobjects.practice.Exercise9;

public class Test {
    public static void swapPoints(SwapPoints points1, SwapPoints points2) {
        int startX = points1.x;
        int startY = points1.y;
        points1.x = points2.x;
        points1.y = points2.y;
        points2.x = startX;
        points2.y = startY;
    }

    public static void main(String[] args) {
        SwapPoints points1 = new SwapPoints(5, 2);
        SwapPoints points2 = new SwapPoints(-3, 6);

    swapPoints(points1, points2);

    System.out.println("(" + points1.x + ", " + points1.y + ")");
    System.out.println("(" + points2.x + ", " + points2.y + ")");
    }
}
