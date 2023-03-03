package HW5.Task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом)

 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> mapSt = new HashMap<>();
        String text = "ghjhg tuioyh gklj; uiouy ghj klj ghj";
        text = removePunctuations(text).toLowerCase();
        String[] arr = text.split(" ");
        String searchWord = "ghj";
        mapSt.put(searchWord, 0);
        for (int i = 0; i < arr.length; i++) {
               if (arr[i].equals(searchWord)) {
                   mapSt.put(arr[i], mapSt.get(arr[i]) + 1);
               }
        }
        System.out.println(searchWord + " was met " + mapSt.get(searchWord) + " time(s)");
    }

    private static String removePunctuations(String source) {
        return source.replaceAll("\\p{IsPunctuation}", "");
    }
    }