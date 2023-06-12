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

    public static String toString(Map<String, Integer> dictionary) {
        StringBuilder output = new StringBuilder("{\n");
        for (Map.Entry<String, Integer> item : dictionary.entrySet()) {
            output.append("  " + item.getKey() + ": " + item.getValue() + "\n");
        }
        output.append("}");
        return output.toString();
    }
}
//END
