package exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordList = new HashMap<>();

        List<String> words = Arrays.asList(sentence.split(" "));

        for (String w : words) {
            if (!wordList.containsValue(w)) {
                int wordCount = Collections.frequency(words, w);
                wordList.put(w, wordCount);
            }
        }

        return wordList;
    }

    public static void toString(Map<String, Integer> dictionary) {
        System.out.println("{");

        for (Map.Entry<String, Integer> item : dictionary.entrySet()) {
            System.out.println("  " + item.getKey() + ": " + item.getValue());
        }

        System.out.println("}");
    }
}
//END
