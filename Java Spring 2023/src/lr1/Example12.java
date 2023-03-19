package lr1;

import java.util.Scanner;
public class Example12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст Пользователя");
        int age = in.nextInt();
        int diff = 2023-age;

        System.out.printf("Пользователь %d года рождения", diff);
    }
}
