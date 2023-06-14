package lab2;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Программа реализует шифрование с алгоритмом Шифр цезаря\n");
        System.out.print("Введите текст для шифровки\n");
        String some_str = id.nextLine();
        System.out.print("Введите ключ (seed)\t");
        int seed = id.nextInt();

        String encoded_str = encode_str(some_str,seed);
        System.out.printf("Текст после преобразования: %s \n",encoded_str);
        System.out.print("Выполнить обратное преобразование? (y/n)\n");

        while (true){

            String flag = id.next();

            if(flag.charAt(0) =='y'){
                System.out.printf("Обратное преобразование %s", decode_str(encoded_str,seed));
                break;
            }
            if(flag.charAt(0)=='n'){
                System.out.print("До свидания");
                break;
            }
            else {
                System.out.print("Введите корректный запрос");
            }
        }
    }
    public static String encode_str(String some_str, int key) {
        String ciphered = "";
        int strlen = some_str.length();

        for(int i = 0; i< strlen;i++){
            char cur_char = some_str.charAt(i);
            int ascii = cur_char;
            ascii = ascii + key;
            cur_char = (char) ascii;

            ciphered = ciphered.concat(Character.toString(cur_char));
        }
        return ciphered;
    }

    public static String decode_str(String some_str, int key) {
        String result = "";
        int strlen = some_str.length();

        for(int i = 0; i< strlen;i++){
            char cur_char = some_str.charAt(i);
            int ascii = cur_char;
            ascii = ascii - key;
            cur_char = (char) ascii;

            result = result.concat(Character.toString(cur_char));
        }
        return result;
    }
}
