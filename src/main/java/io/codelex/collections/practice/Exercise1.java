package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        ArrayList<String> arrayList = new ArrayList<>();
        for (String brand : array) {
            arrayList.add(brand);
        }
        System.out.println("ArrayList: " + arrayList);

        //todo - replace array with a HashSet and print out the results
        HashSet<String> hashSet = new HashSet<>();
        for (String brand : array) {
            hashSet.add(brand);
        }
        System.out.println("HashSet: " + hashSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        HashMap<String, String> hashMap = new HashMap<>();
        for (String brand : array) {
            String origination = getOrigination(brand);
            hashMap.put(brand, origination);
        }
        System.out.println("HashMap: " + hashMap);
    }
    private static String getOrigination(String brand) {
        return switch (brand) {
            case "Audi" -> "Germany";
            case "BMW" -> "Germany";
            case "Honda" -> "Japan";
            case "Mercedes" -> "Germany";
            case "VolksWagen" -> "Germany";
            case "Tesla" -> "USA";
            default -> "Unknown";
        };
    }
}
