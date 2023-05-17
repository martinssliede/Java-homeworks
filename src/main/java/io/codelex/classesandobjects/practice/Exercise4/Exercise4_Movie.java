package io.codelex.classesandobjects.practice.Exercise4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise4_Movie {
    private String title;
    private String studio;
    private String rating;

    public Exercise4_Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Exercise4_Movie(String title, String studio) {
        this(title, studio, "PG");
    }

    // Nesaprotu kā šī metode jādefinē lai atgrieztu nepieciešamo? Un kas ir base type Movie?
//    public String getPG() {
//    }
}
