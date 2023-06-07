package io.codelex.polymorphism.practice.exercise2;


import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Firework firework = new Firework();
        Radio radio = new Radio();
        Parrot parrot = new Parrot();
        Firework firework2 = new Firework();
        Radio radio2 = new Radio();
        Parrot parrot2 = new Parrot();

        List<Sound> soundList = new ArrayList<>();

        soundList.add(firework);
        soundList.add(radio);
        soundList.add(parrot);
        soundList.add(firework2);
        soundList.add(radio2);
        soundList.add(parrot2);

        for (Sound sound : soundList) {
            sound.playSound();
        }
    }
}
