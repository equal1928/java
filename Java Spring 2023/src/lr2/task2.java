package lr2;

public class task2 {
    public static void main(String[] args) {
        int size_v = 5;
        int size_h = 6;
        int[][] matrix = new int[size_v][size_h];
        int filler = 0;
        for(int i = 0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                int strlen = matrix[i].length-1;
                if(i%2==0){
                    matrix[i][j] = filler;
                }
                else{
                    matrix[i][strlen-j] = filler;
                }
                filler = filler+1;
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.print('\t');
            }
            System.out.print('\n');
        }
    }
}
