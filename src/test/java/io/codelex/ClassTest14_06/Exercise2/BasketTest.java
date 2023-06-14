package io.codelex.ClassTest14_06.Exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BasketTest {

    @Test
    void testAddToBasket() {
        Basket<Apple> appleBasket = new Basket<>();

        for (int i = 0; i < 5; i++) {
            appleBasket.addToBasket(new Apple());
        }
        assertEquals(5, appleBasket.getCurrentCount());
    }

    @Test
    void testRemoveFromBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        for (int i = 0; i < 3; i++) {
            mushroomBasket.addToBasket(new Mushroom());
        }
        for (int i = 0; i < 2; i++) {
            mushroomBasket.removeFromBasket();
        }
        assertEquals(1, mushroomBasket.getCurrentCount());
    }

    @Test
    void testBasketFull() {
        Basket<Apple> appleBasket = new Basket<>();
        for (int i = 0; i <= 10; i++) {
            appleBasket.addToBasket(new Apple());
        }
        assertThrows(BasketFullException.class, () -> {
            appleBasket.addToBasket(new Apple());
        });
    }

    @Test
    void testBasketEmpty() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        assertThrows(BasketEmptyException.class, mushroomBasket::removeFromBasket);
    }
}
