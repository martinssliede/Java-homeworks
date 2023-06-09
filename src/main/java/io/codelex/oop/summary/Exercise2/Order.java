package io.codelex.oop.summary.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getItemsList() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            builder.append((i + 1) + ". " + items.get(i).fullInfo() + "\n");
        }
        return builder.toString();
    }
}
