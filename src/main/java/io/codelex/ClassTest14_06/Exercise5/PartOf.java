package io.codelex.ClassTest14_06.Exercise5;

import java.util.List;
import java.util.function.Predicate;

public class PartOf {
    public static <T> double partOf(List<T> list, Predicate<T> condition) {
        long count = list.stream()
                .filter(condition)
                .count();
        return (double) count / list.size();
    }
}
