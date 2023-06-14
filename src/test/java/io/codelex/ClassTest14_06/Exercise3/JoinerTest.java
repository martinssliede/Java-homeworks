package io.codelex.ClassTest14_06.Exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    @Test
    public void testJoin() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String joinedNumbers = joiner.join(1,2,3,4,5);

        Assertions.assertEquals("1-2-3-4-5", joinedNumbers);
    }
}
