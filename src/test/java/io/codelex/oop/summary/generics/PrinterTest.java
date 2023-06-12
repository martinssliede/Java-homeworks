package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

public class PrinterTest {

    @Test
    public void testPrinter() {
        BigDecimal bigDecimal = new BigDecimal("123.456");
        Printer<BigDecimal> printer = new Printer<>(bigDecimal);
        String expectedOutput = bigDecimal.toString();
        String actualOutput = captureOutput(printer::print);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    private String captureOutput(Runnable runnable) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOutput = System.out;
        System.setOut(printStream);
        runnable.run();
        System.setOut(originalOutput);

        return outputStream.toString().trim();
    }
}
