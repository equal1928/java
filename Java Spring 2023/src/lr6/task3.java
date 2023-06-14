package lr6;


import java.util.List;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {

        String string = "Очень важная строка" + "в которой есть слова" + "С большой буквы," + "а есть с маленькой";

        List<String> strings = List.of(string.split(""));
        System.out.println("\n"+"Строка после сплита: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringAfter = filterCapitalizedStrings(strings);

        System.out.println("\n"+"Строка после преобразования: " + "\n");
        for (String e : stringAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}