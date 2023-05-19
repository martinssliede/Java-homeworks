package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private double rating;
    private boolean availability;

    public Video(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setNotAvailable() {
        availability = false;
    }
    public void setAvailable() {
        availability = true;
    }

    public void addRating(int rating) {
        this.rating = (this.rating + rating) / 2;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", availability=" + availability +
                '}';
    }
}
