package lr1;

import java.util.Scanner;

public class Example7 {
    public static void e() {
        var scanner = new Scanner(System.in);

        System.out.println("Input Name");
        var name = scanner.nextLine();

        System.out.println("Input Age");
        var age = scanner.nextLine();

        System.out.printf("Hello, %s %d ", name, age);
        scanner.close();
    }
}
