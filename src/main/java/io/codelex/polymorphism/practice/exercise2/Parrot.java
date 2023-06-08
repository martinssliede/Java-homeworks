package io.codelex.polymorphism.practice.exercise2;

public class Parrot implements Sound{
    private String sound;

    public Parrot(String sound) {
        this.sound = sound;
    }

    @Override
    public void playSound() {
        System.out.println(sound);
    }
}
