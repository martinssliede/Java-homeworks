package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Optional;

public class StorageHouseTest {

    @Test
    public void testGetMaybeFirstItem() {
        StorageHouse<String> storageHouse = new StorageHouse<>("Candy");
        storageHouse.addMoreItems("Chocolate");
        storageHouse.addMoreItems("Cookie");

        Optional<String> maybeFirstItem = storageHouse.getMaybeFirstItem();
        Assertions.assertTrue(maybeFirstItem.isPresent());
        Assertions.assertEquals("Candy", maybeFirstItem.get());

    }

    @Test
    public void testPrintItems() {
        StorageHouse<Integer> storageHouse = new StorageHouse<>(10);
        storageHouse.addMoreItems(22);
        storageHouse.addMoreItems(33);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        storageHouse.printItems();
        String output = outputStream.toString().trim();
        Assertions.assertEquals("10\n22\n33", output);
    }
}
