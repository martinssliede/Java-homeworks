package io.codelex.ClassTest14_06.Exercise3;

import java.util.Arrays;

public class Joiner <T>{
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... elements) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < elements.length; i++) {
//            builder.append(elements[i].toString());
//            if (i < elements.length - 1) {
//                builder.append(separator);
//            }
//        }
//        return builder.toString();
        return String.join(separator, Arrays.stream(elements)
                .map(Object::toString)
                .toArray(String[]::new));
    }
}
