package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        //TODO: Create an ArrayList with String elements

        for (int i = 1; i <= 10; i++) {
            arrayList.add("Value " + i);
        }
        System.out.println(arrayList);
        //TODO: Add 10 values to list

        arrayList.add(4, "New value at 5th position");
        System.out.println(arrayList);
        //TODO: Add new value at 5th position

        int lastPosition = arrayList.size() - 1;
        arrayList.set(lastPosition, "New value at last element");
        System.out.println(arrayList);
        //TODO: Change value at last position (Calculate last position programmatically)

        Collections.sort(arrayList);
        System.out.println(arrayList);
        //TODO: Sort your list in alphabetical order

        boolean containsFoobar = arrayList.contains("Foobar");
        System.out.println(containsFoobar);
        //TODO: Check if your list contains "Foobar" element

        for (String element : arrayList) {
            System.out.println(element);
        }
        //TODO: Print each element of list using loop
    }

}
