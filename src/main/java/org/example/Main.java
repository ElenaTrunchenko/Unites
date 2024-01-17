package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(10, 1);
        int c = calc.devide.apply(a, b); // происходит деление на 0 (b=1-1)

        calc.println.accept(c);
    }
}