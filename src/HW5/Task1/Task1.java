package HW5.Task1;

import java.util.HashMap;
import java.util.Map;

import static java.awt.SystemColor.text;

/* Подсчитать количество вхождения каждого слова
        Пример:
        Россия идет вперед всей планеты. Планета — это не Россия.

 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> mapSt = new HashMap<>();
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = removePunctuations(text).toLowerCase();
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == " ") return;
            else
            {
                mapSt.putIfAbsent(arr[i], 0);
                mapSt.put(arr[i], mapSt.get(arr[i]) + 1);
            }
        }
        for (var entry : mapSt.entrySet()) {
            System.out.println(entry.getKey() + " встретилось " + entry.getValue() + " раз(а)");
        }
    }

    private static String removePunctuations(String source) {
        return source.replaceAll("\\p{IsPunctuation}", "");
    }
}
