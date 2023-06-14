package lr6;
import java.util.List;
import java.util.stream.Collectors;

public class task7 {
    public static void main(String[] args) {

            String string = "Очень важная строка" + "в которой есть слова" + "С большой буквы," + "а есть с маленькой";

            List<String> strings = List.of(string.split(""));
            System.out.println("\n"+"Строка после сплита: " + "\n");
            for (String e : strings) {
                System.out.println(e);
            }

            int len = 4;

            List<String> stringAfter = filterCapitalizedStrings(strings, len);

            System.out.println("\n"+"Строка после преобразования: " + "\n");
            for (String e : stringAfter) {
                System.out.println(e);
            }
        }

        public static List<String> filterCapitalizedStrings(List<String> list, int len) {
            return list.stream()
                    .filter(s -> s.length() > len)
                    .collect(Collectors.toList());
        }
}
