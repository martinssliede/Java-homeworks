package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        //TODO: add 5 values to Set.
        mySet.add("Red");
        mySet.add("Black");
        mySet.add("Yellow");
        //..
        mySet.add("Purple");
        mySet.add("Green");

        System.out.println("Should have 5 elements: " + mySet); //Pay attention on order!

        for (String color : mySet) {
            System.out.println(color);
        }

        //TODO: iterate through all elements in set
        /*
        for (...) {
            System.out.println(element);
        }
        */

        mySet.clear();

        //TODO: remove all values from set
        System.out.println("Should be empty: " + mySet);

        //TODO: check if it is possible to add duplicated values
        mySet.add("Green");
        mySet.add("Orange");
        mySet.add("Green");
        mySet.add("Purple");
        mySet.add("Purple");

        System.out.println(mySet);
        System.out.println("The same value can be added only once!");
    }

}
