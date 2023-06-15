package lr6;

import java.util.List;
import java.util.stream.Collectors;

public class task9 {
    public static void main(String[] args) {

            String string = "Очень важная строка 122 \t" + "в которой есть слова \t" + "С большой буквы, \t" + "а есть с маленькой 536 \t";

            List<String> strings = List.of(string.split("\t"));
            System.out.println("\n"+"Строка после сплита: " + "\n");
            for (String e : strings) {
                System.out.println(e);
            }

            List<String> stringAfter = checkRegex(strings);

            System.out.println("\n"+"Строка после преобразования: " + "\n");
            for (String e : stringAfter) {
                System.out.println(e);
            }
        }

        public static List<String> checkRegex(List<String> list) {
            return list.stream()
                    .filter(task9::checkInt)
                    .collect(Collectors.toList());
        }
        public static Boolean checkInt(String word) {

        boolean hasDigits = false;
        for(int i = 0; i < word.length() && hasDigits; i++) {
            if(!Character.isAlphabetic(word.charAt(i))) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }
}
