package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task2 {


    public Student[] filter(Student[] input, Predicate<Student> p) {

        Student[] result = new Student[input.length];

        int counter = 0;
        for (Student student : input) {
            if (p.test(student)) {
                result[counter] = student;
                counter++;
            }
        }


        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void main(String[] args) {

        Student[] students = {
                new Student("Іван","Петренко", "АІ-243", new int[]{85, 90, 78}),
                new Student("Марія", "Коваль", "АІ-242", new int[]{95, 100, 92}),
                new Student("Сергій", "Іванов", "АІ-241", new int[]{70, 65, 55}),
                new Student("Олена", "Бондар", "АІ-244", new int[]{100, 100, 100}),
                new Student("Петро", "Сидоренко", "АІ-245", new int[]{45, 80, 75})
        };

        Predicate<Student> hasNoDebts = s -> {
            int[] marks = s.getMarks();

            for (int mark : marks) {
                if (mark < 60) {
                    return false;
                }
            }

            return true;
        };


        Task2 task = new Task2();
        Student[] successfulStudents = task.filter(students, hasNoDebts);
        System.out.println("Список студентів без заборгованостей:");
        System.out.println(Arrays.toString(successfulStudents));
    }
}