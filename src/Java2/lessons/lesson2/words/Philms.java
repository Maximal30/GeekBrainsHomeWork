package Java2.lessons.lesson2.words;

import java.util.*;

public class Philms {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Кин-дза-дза", "17 мгновений весны", "Области тьмы", "Скала", "Видоизменённый углерод",
                "Горец", "Ликвидация", "Багровые реки", "Люди в чёрном-1", "Ликвидация",
                "Матрица", "Приключения Шурика", "Люди в чёрном-1", "Скала", "Город зеро",
                "Приключения Шурика", "Люди в чёрном-1", "Город зеро", "Скала", "Люди в чёрном-1"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
