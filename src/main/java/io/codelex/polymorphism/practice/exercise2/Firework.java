package io.codelex.polymorphism.practice.exercise2;

class Firework implements Sound {
    private String sound;

    public Firework(String sound) {
        this.sound = sound;
    }

    public void playSound() {
        System.out.println(sound);
    }
}
