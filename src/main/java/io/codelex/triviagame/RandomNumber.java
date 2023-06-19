package io.codelex.triviagame;

import java.util.Random;

public class RandomNumber {
    public static int random() {
        Random random = new Random();
        int randomNumber = random.nextInt(10000) + 1;
        return randomNumber;
    }
}
