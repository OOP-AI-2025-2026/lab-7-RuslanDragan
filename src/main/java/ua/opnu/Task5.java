package ua.opnu;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task5 {


    public void conditionalAction(int[] input, Predicate<Integer> p, Consumer<Integer> c) {
        for (int item : input) {

            if (p.test(item)) {
                c.accept(item);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};



        Predicate<Integer> isEven = n -> n % 2 == 0;

        Consumer<Integer> printMultipliedByTen = n -> {
            System.out.println(n * 10);
        };

        System.out.println("Виконуємо дію (множення на 10) тільки для парних чисел:");

        Task5 task = new Task5();
        task.conditionalAction(numbers, isEven, printMultipliedByTen);
    }
}