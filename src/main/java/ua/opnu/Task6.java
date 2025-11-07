package ua.opnu;

import java.util.Arrays;
import java.util.function.Function;

public class Task6 {

    public int[] processArray(int[] input, Function<Integer, Integer> function) {
        int[] result = new int[input.length];

        for (int i = 0; i < input.length; i++) {

            result[i] = function.apply(input[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Function<Integer, Integer> powerOfTwo = n -> (int) Math.pow(2, n);

        Task6 task = new Task6();
        int[] results = task.processArray(numbers, powerOfTwo);

        System.out.println("Початковий масив: " + Arrays.toString(numbers));
        System.out.println("Масив після застосування 2^n: " + Arrays.toString(results));
    }
}