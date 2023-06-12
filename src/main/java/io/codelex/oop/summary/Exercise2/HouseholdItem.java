package io.codelex.oop.summary.Exercise2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class HouseholdItem extends AbstractItem{
    private String color;
    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    @Override
    public String fullInfo() {
        return getName() + ", " + decimalFormat.format(getPrice()) + " EUR, color: " + color;
    }
}
