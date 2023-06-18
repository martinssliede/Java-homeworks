package io.codelex.ClassTest14_06.Exercise5;

import java.util.Arrays;
import java.util.List;

import static io.codelex.ClassTest14_06.Exercise5.PartOf.partOf;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(percent);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 0);
        System.out.println(evenPercent);
    }
}
