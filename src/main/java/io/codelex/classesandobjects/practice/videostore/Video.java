package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private final String title;
    private int ratingCount;
    private float totalRating;
    private boolean isCheckedOut;

    public Video(String title) {
        this.title = title;
        this.isCheckedOut = false;
        this.ratingCount = 0;
        this.totalRating = 0;
    }

    public void checkOut() {
        this.isCheckedOut = true;
    }

    public void returnVideo() {
        this.isCheckedOut = false;
    }

    public void receiveRating(int rating) {
        this.ratingCount++;
        this.totalRating += rating;
    }

    public float getAverageRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return totalRating / ratingCount;
    }

    public String getTitle() {
        return title;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", averageRating=" + getAverageRating() +
                ", isCheckedOut=" + isCheckedOut +
                '}';
    }
}
