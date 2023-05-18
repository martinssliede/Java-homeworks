package io.codelex.classesandobjects.practice.Exercise4;

import java.lang.reflect.Array;
import java.util.ArrayList;

// JAUTĀJUMS PAR FILMU MASĪVA IZVEIDOŠANU;
public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    // Write a method getPG, which takes an array of base type Movie as its argument, and returns a new array of only those movies in the input array with a rating of "PG". You may assume the input array is full of Movie instances. The returned array need not be full.???

    public String getRating() {
        return rating;
    }
}
