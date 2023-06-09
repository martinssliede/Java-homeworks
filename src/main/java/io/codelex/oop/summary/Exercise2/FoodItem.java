package io.codelex.oop.summary.Exercise2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodItem extends AbstractItem{

    private Date bestBefore;
    public FoodItem(String name, double price, Date bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    @Override
    public String fullInfo() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return getName() + " ," + getPrice() + " EUR, best before: " + format.format(bestBefore);
    }
}
