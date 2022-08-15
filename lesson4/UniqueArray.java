package lesson4;

import java.util.*;

public class UniqueArray {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Марс", "Юпитер", "Плутон", "Уран", "Уран",
                "Сатурн", "Венера", "Марс", "Нептун", "Солнце",
                "Земля", "Юпитер", "Луна", "Нептун", "Марс"
        );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Массив: ");
        System.out.println(words.toString());
        System.out.println("Уникальные слова: ");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости по словам: ");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
