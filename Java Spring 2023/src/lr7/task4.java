package lr7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class task4 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("example/input.txt");
        FileWriter writer = new FileWriter("example/output.txt");

        int s;

        while ((s = reader.read()) != -1) {

            writer.write(s);

        }
        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }
}
