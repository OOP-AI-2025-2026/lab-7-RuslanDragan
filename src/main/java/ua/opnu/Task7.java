package ua.opnu;

import java.util.Arrays;
import java.util.function.Function;

public class Task7 {

    public String[] stringify(int[] input, Function<Integer, String> converter) {
        String[] result = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            result[i] = (String) converter.apply(input[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        Function<Integer, String> intToWord = n -> switch (n) {
            case 0 -> "нуль";
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            case 4 -> "чотири";
            case 5 -> "п'ять";
            case 6 -> "шість";
            case 7 -> "сім";
            case 8 -> "вісім";
            case 9 -> "дев'ять";
            default -> "невідоме число";
        };

        Task7 task = new Task7();
        String[] stringResults = task.stringify(numbers, intToWord);

        System.out.println("Початковий масив: " + Arrays.toString(numbers));
        System.out.println("Масив у вигляді рядків: " + Arrays.toString(stringResults));
    }
}