package io.codelex.oop.summary.Exercise2;

import java.text.SimpleDateFormat;

public class HouseholdItem extends AbstractItem{
    private String color;
    public HouseholdItem(String name, double price,String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String fullInfo() {
        return getName() + " ," + getPrice() + " EUR, color: " + color;
    }
}
