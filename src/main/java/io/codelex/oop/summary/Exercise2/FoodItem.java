package io.codelex.oop.summary.Exercise2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FoodItem extends AbstractItem{

    private LocalDate bestBefore;
    public FoodItem(String name, double price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public String bestBeforeFormatted() {
        return bestBefore.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    @Override
    public String fullInfo() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return getName() + ", " + decimalFormat.format(getPrice()) + " EUR, best before: " + bestBeforeFormatted();
    }
}
