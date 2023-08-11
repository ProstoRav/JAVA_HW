package geekbrains.hw.lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        countEachWord(text);
    }

    /**
     * @param text искомый текст
     * @apiNote выводим на экран количество вхождения каждого слова в искомом
     * тексте с игнорированием пунктуации
     */

    private static void countEachWord(String text) {
        System.out.println("Искомый текст: \n" + text);
        System.out.println();
        System.out.println("Количество вхождения каждого слова: ");
        text = text.replaceAll("[^а-яА-я\\s]", "").replaceAll("\\s{2,}", " ");
        String[] words = text.toLowerCase().split(" ");
        Map<String, Integer> mapOfWords = new HashMap<>();
        for (String s : words) {
            mapOfWords.putIfAbsent(s, 0);
            mapOfWords.put(s, mapOfWords.get(s) + 1);
        }
        for (Map.Entry<String, Integer> items : mapOfWords.entrySet()) {
            System.out.printf("%s: %d раз(а)%n", items.getKey(), items.getValue());
        }
    }
}
