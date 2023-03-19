package lr1;

import java.util.Scanner;
public class Example10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения Пользователя");
        int year = in.nextInt();
        int diff = 2023 - year;

        System.out.printf("Пользователю %d лет", diff);

    }
}
