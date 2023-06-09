package io.codelex.polymorphism.practice.exercise2;


import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Firework firework = new Firework("Prrrrr");
        Radio radio = new Radio("Shhhhhhhh");
        Parrot parrot = new Parrot("Hey, I am Rocky, the parrot!");
        Firework firework2 = new Firework("whoosh-bang");
        Radio radio2 = new Radio("You are listening to 101.5 FM!");
        Parrot parrot2 = new Parrot("Kekekekeke");

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
