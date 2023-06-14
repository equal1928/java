package lr4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива");
        while (!scanner.hasNext(Pattern.compile("y"))) {
            try {
                //Проверка на число
                int data = Integer.parseInt(scanner.next());
                //Проверка на положительность
                if (data < 0) throw new ArithmeticException();
                //Проверка типа числа

            } catch (ArithmeticException a) {
                System.out.println("Ввели отрицательное число");
            } catch (NumberFormatException e) {
                System.out.println("Ввели тип, отличный от int");
            }
        }
        System.out.println("Успешно закончилась");
    }
}