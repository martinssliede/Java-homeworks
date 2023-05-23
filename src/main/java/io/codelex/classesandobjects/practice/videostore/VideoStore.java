package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private List<Video> inventory;

    public VideoStore() {
        this.inventory = new ArrayList<>();
    }

    public void addVideo(Video video) {
        this.inventory.add(video);
    }

    public void checkOut(String title) {
        for (Video v : inventory) {
            if (v.getTitle().equals(title)) {
                v.checkOut();
            }
        }
    }

    public void returnVideo(String title) {
        for (Video v : inventory) {
            if (v.getTitle().equals(title)) {
                v.returnVideo();
            }
        }
    }

    public void receiveRating(String title, int rating) {
        for (Video v : inventory) {
            if (v.getTitle().equals(title)) {
                v.receiveRating(rating);
            }
        }
    }

    public void printOutInventory() {
        for (Video v : inventory) {
            System.out.println(v);
        }
    }
}
