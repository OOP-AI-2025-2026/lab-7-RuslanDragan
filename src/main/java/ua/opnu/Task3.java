package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task3 {


    public Student[] filterWithTwoConditions(Student[] input, Predicate<Student> p1, Predicate<Student> p2) {
        Student[] result = new Student[input.length];
        int counter = 0;

        for (Student student : input) {


            if (p1.test(student) && p2.test(student)) {
                result[counter] = student;
                counter++;
            }
        }

        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void main(String[] args) {

        Student[] students = {
                new Student("Іван","Петренко", "АІ-243", new int[]{85, 90, 78}),
                new Student("Марія", "Коваль", "АІ-244", new int[]{95, 100, 92}),
                new Student("Сергій", "Іванов", "АІ-241", new int[]{70, 65, 55}),
                new Student("Олена", "Бондар", "АІ-244", new int[]{100, 100, 100}),
                new Student("Петро", "Сидоренко", "АІ-245", new int[]{45, 80, 75})
        };

        Predicate<Student> hasNoDebts = s -> {
            for (int mark : s.getMarks()) {
                if (mark < 60) {
                    return false;
                }
            }
            return true;
        };

        Predicate<Student> isInGroupIP22 = s -> s.getGroup().equals("АІ-244");

        Task3 task = new Task3();
        Student[] filteredStudents = task.filterWithTwoConditions(students, hasNoDebts, isInGroupIP22);


        System.out.println("Результат фільтрації (без боргів ТА з групи АІ-244):");
        System.out.println(Arrays.toString(filteredStudents));
    }
}