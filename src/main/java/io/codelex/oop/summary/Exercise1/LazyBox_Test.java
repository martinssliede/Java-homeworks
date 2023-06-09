package io.codelex.oop.summary.Exercise1;

public class LazyBox_Test {
    public static void main(String[] args) {
        LazyBox<Integer> box = new LazyBox<>(LazyBox_Test::calculate);

        Integer contents = box.get();
        System.out.println("Contents: " + contents);

        Integer contents2 = box.get();
        System.out.println("Contents: " + contents2);
    }

    public static Integer calculate() {
        return 200;
    }
}
