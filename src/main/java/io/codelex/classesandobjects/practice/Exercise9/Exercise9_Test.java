package io.codelex.classesandobjects.practice.Exercise9;

public class Exercise9_Test {
    public static void swapPoints(Exercise9_SwapPoints points1, Exercise9_SwapPoints points2) {
        int startX = points1.x;
        int startY = points1.y;
        points1.x = points2.x;
        points1.y = points2.y;
        points2.x = startX;
        points2.y = startY;
    }

    public static void main(String[] args) {
    Exercise9_SwapPoints points1 = new Exercise9_SwapPoints(5, 2);
    Exercise9_SwapPoints points2 = new Exercise9_SwapPoints(-3, 6);

    swapPoints(points1, points2);

    System.out.println("(" + points1.x + ", " + points1.y + ")");
    System.out.println("(" + points2.x + ", " + points2.y + ")");
    }
}
