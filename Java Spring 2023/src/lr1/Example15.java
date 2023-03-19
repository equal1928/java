package lr1;

import java.util.Scanner;
public class Example15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Это программа, в которой Пользователь вводит два числа, а программой вычисляется и отображается сумма и разность этих чисел.\n");
        System.out.println("Введите число А");
        float A = in.nextFloat();
        System.out.println("Введите число B");
        float B = in.nextFloat();

        System.out.printf("Сумма чисел A+B равна %f, разность чисел A-B равна %f", A+B,A-B);
    }
}
