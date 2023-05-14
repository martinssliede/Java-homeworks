package io.codelex.classesandobjects.practice;

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

    public static Exercise4_Movie[] getPG(Exercise4_Movie[] movies) {
        ArrayList<Exercise4_Movie> pgMovies = new ArrayList<Exercise4_Movie>();
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                pgMovies.add(movies[i]);
            }
        }
        return pgMovies.toArray(pgMovies.toArray(new Exercise4_Movie[0]));
    }
}
