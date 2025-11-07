package ua.opnu;

import java.util.function.Consumer;

public class Task4 {


    public void forEach(Student[] input, Consumer<Student> action) {
        for (Student student : input) {
            action.accept(student);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Іван","Петренко", "АІ-243", new int[]{85, 90, 78}),
                new Student("Марія", "Коваль", "АІ-242", new int[]{95, 100, 92}),
                new Student("Сергій", "Іванов", "АІ-241", new int[]{70, 65, 55}),
                new Student("Олена", "Бондар", "АІ-244", new int[]{100, 100, 100}),
                new Student("Петро", "Сидоренко", "АІ-245", new int[]{45, 80, 75})
        };

        Consumer<Student> printSurnameAndName = s -> {
            System.out.println(s.getSurname() + " " + s.getName());
        };

        System.out.println("Список студентів (ПРІЗВИЩЕ ІМ'Я):");
        Task4 task = new Task4();
        task.forEach(students, printSurnameAndName);
    }
}