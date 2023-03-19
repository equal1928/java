package lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Программа предназначена дял вычисления суммы двух чисел A+B");
        System.out.println("Введите число А");
        float A = in.nextFloat();
        System.out.println("Введите число B");
        float B = in.nextFloat();
        float sum = A+B;
        System.out.printf("%f",sum);
    }
}
