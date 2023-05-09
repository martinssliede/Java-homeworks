package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        // Piekļūst pi vērtībai;
        BigDecimal pi = BigDecimal.valueOf(Math.PI);
        // Iegūst rādiusu kvadrātā;
        BigDecimal radiusSquared = radius.multiply(radius);
        // Sareizina formulā;
        BigDecimal area = pi.multiply(radiusSquared);
        // Atgriež, un pārveido par double;
        return area.doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        // Sareizina abus input;
        BigDecimal area = length.multiply(width);
        // Atgriež pārveidotu par double;
        return area.doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        // Sareizina abus input, un vēl pareizina ar 0.5
        BigDecimal area = (base.multiply(h)).multiply(BigDecimal.valueOf(0.5));
        return area.doubleValue();
    }
}
