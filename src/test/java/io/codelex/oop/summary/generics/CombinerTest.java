package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CombinerTest {

    @Test
    public void testCombiningTwoItems() {
        Integer firstItem = 42;
        BigDecimal secondItem = new BigDecimal("2.99");
        String expectedResult = "First item: 42; Second item: 2.99";
        String actualResult = Combiner.combineTwoItems(firstItem, secondItem);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
