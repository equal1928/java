package lr6;

import java.util.List;
import java.util.stream.Collectors;

public class task5 {
    public static void main(String[] args) {
        String string = "Очень важная строка\t" + "в которой есть слова\t" + "С большой буквы\t" + "а есть с маленькой\t";
        List<String> strings = List.of(string.split("\t"));
        System.out.println("\n"+"Строка после сплита: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        String substring = "есть";
        List<String> stringAfter = filterCapitalizedStrings(strings, substring);
        System.out.println("\n"+"Строка после преобразования: " + "\n");
        for (String e : stringAfter) {
            System.out.println(e);
        }
    }
    public static List<String> filterCapitalizedStrings(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.toLowerCase().contains(substring))
                .collect(Collectors.toList());
    }
}
