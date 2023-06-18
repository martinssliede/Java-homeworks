package io.codelex.ClassTest14_06.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket <T> {

    private List<T> items;
    private int currentCount;

    public Basket() {
        this.items = new ArrayList<>(10);
        this.currentCount = 0;
    }

    public void addToBasket(T item) {
        if (currentCount == items.size()) {
            throw new BasketFullException("Basket is full!");
        }
        currentCount++;
    }

    public void removeFromBasket() {
        if (currentCount == 0) {
            throw new BasketEmptyException("Basket is empty!");
        }
        currentCount--;
    }

    public int getCurrentCount() {
        return currentCount;
    }
}
