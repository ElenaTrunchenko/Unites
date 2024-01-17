package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Subtraction")
    void calcMinus() {
        int x = 2;
        int y = 2;
        Calculator calculator = new Calculator();
        int minus = calculator.minus.apply(x, y);
        assertEquals(0, minus);
    }

    @Test
    @DisplayName("The amount")
    void calcPlus() {
        int x = 2;
        int y = 2;
        Calculator calculator = new Calculator();
        int samm = calculator.plus.apply(x, y);
        assertEquals(4, samm);
    }

    @Test
    @DisplayName("Division")
    void calcDevide() {
        Calculator calculator = new Calculator();
        Integer apply = calculator.devide.apply(1, 1);
        assertEquals(1, apply);
    }

    @Test
    @DisplayName("Division by zero")
    void calcException() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.devide.apply(10, 0);
        });
    }
}