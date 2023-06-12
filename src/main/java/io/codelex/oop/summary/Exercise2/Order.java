package io.codelex.oop.summary.Exercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    private ArrayList<SellableThing> things;
    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) throws BadFoodException {
        items.add(item);
        if (item instanceof FoodItem foodItem) {
            if (foodItem.getBestBefore().isBefore(LocalDate.now())) {
                throw new BadFoodException("Expiration date can not be less than, or todays date.");
            }
        }
    }

    public String getItemsList() {
        StringBuilder builder = new StringBuilder();
        builder.append("Items: \n");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            builder.append((i + 1) + ". " + item.fullInfo() + "\n");
        }
        return builder.toString();
    }

    public List<Item> getItems() {
        return items;
    }
    public void itemsToString() {
        for (SellableThing item : items) {
            System.out.println(item.fullInfo());
        }
    }
}
