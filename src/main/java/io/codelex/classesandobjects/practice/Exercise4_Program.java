package io.codelex.classesandobjects.practice;

public class Exercise4_Program {
    public static void main(String[] args) {
        Exercise4_Movie movie1 = new Exercise4_Movie("Casino Royale", "Eon Productions", "PG13");
        Exercise4_Movie movie2 = new Exercise4_Movie("Glass", "Buena Vista International", "PG13");
        Exercise4_Movie movie3 = new Exercise4_Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures");

        Exercise4_Movie[] allMovies = {movie1, movie2, movie3};
        Exercise4_Movie[] allPGMovies = Exercise4_Movie.getPG(allMovies);
        System.out.println("PG movies: ");
        for (int i = 0; i < allMovies.length; i++) {

        }
    }
}
