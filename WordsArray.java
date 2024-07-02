import java.util.*;

public class WordsArray {
    public static void main(String[] args) {
        String[] array = {"зеркало", "фикус", "мяч", "листок", "кофе", "зеркало",
                "книга", "картина", "вывеска", "кофе", "фикус", "фикус", "зарядка",
                "наушники", "лист", "резинка", "аромат", "ножницы"};

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : array) {
            Integer count = wordsCount.get(word);
            if (count == null) {
                count = 0;
            }
            wordsCount.put(word, count + 1);
        }
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
                System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раз");
        }
    }
}