package lr2;
import java.util.Random;

// 1. Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне. В этом массиве необходимо определить элемент с минимальным значением.
// В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
// Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
public class task1 {
    public static void main(String[] args) {

        int size_v = 5;
        int size_h = 6;
        int[][] matrix = new int[size_v][size_h];

        Random random = new Random();

        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++){
                matrix[i][j] = random.nextInt(10); // заполним массив
            }
        }
        // выведем массив в консоль
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.print('\t');
            }
            System.out.print('\n');
        }

        // Выведем минимальные элементы и их индексы
        int min_value = matrix[0][0];

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (min_value > anInt) {
                    min_value = anInt; // нашли минимальный
                }
            }
        }
        System.out.printf("Минимальное значение элемента в матрице %d \n", min_value);
        System.out.print("Позиции минимальных элементов в матрице:\t");
        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++) {
                if (min_value == matrix[i][j]) {
                    System.out.printf("{%d %d}",i,j);
                    System.out.print("\t");
                }
            }
        }
    }
}
