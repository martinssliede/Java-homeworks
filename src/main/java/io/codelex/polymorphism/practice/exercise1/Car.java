package io.codelex.polymorphism.practice.exercise1;

import static io.codelex.polymorphism.practice.exercise1.Nitrous.currentSpeed;

public interface Car {
    void speedUp();
    void slowDown();
    default String showCurrentSpeed()  {
        return currentSpeed;
    };
    void startEngine();

}
