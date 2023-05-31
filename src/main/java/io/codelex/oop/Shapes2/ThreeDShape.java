package io.codelex.oop.Shapes2;

public abstract class ThreeDShape extends Shape {

    public ThreeDShape(int numSides) {
        super(numSides);
    }

    public abstract void calculateVolume();


}
