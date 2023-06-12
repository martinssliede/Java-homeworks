package io.codelex.oop.summary.Exercise2;

import java.text.DecimalFormat;

public class ElectronicsItem extends AbstractItem{
    private int power;
    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    @Override
    public String fullInfo() {
        return getName() + ", " + decimalFormat.format(getPrice()) + " EUR, power: " + power + "W";
    }
}
