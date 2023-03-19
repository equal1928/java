package lr1;

import java.util.Scanner;
public class Example6 {
    public static void e() {
        var scanner = new Scanner(System.in);

        System.out.println("Input Surname");
        var surname = scanner.nextLine();

        System.out.println("Input Name");
        var name = scanner.nextLine();

        System.out.println("Input Last Name");
        var second_name = scanner.nextLine();

        System.out.printf("Hello, %s %s %s", surname, name, second_name);
        scanner.close();
    }
}


