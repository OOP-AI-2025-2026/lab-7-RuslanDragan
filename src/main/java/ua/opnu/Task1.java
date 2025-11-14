package ua.opnu;
import java.util.function.Predicate;

public class Task1 {

    public static void main(String[] args) {

        Predicate<Integer> isSimple = n -> {

            if (n <= 1) {
                return false;
            }


            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        };

        System.out.println("Чи є 7 простим числом? " + isSimple.test(7));
        System.out.println("Чи є 10 простим числом? " + isSimple.test(10));
        System.out.println("Чи є 1 простим числом? " + isSimple.test(1));
        System.out.println("Чи є 13 простим числом? " + isSimple.test(13));
        System.out.println("Чи є 0 простим числом? " + isSimple.test(0));
    }
}