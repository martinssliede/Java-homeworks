package io.codelex.polymorphism.practice.exercise2;

public class Radio implements Sound{
    @Override
    public void playSound() {
        System.out.println("You are listening to 101.5 FM!");
    }
}
