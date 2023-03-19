package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("программой отображается последовательность из четырех чисел: число, " +
                "на единицу меньше введённого, введенное число и число, на единицу больше введенного." +
                " Четвертое число это квадрат суммы первых трех чисел");
        System.out.println("Введите число");
        float A = in.nextFloat();
        System.out.printf("%f %f %f %f",A-1,A,A+1,9*A);
    }
}
