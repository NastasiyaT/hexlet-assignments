package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letter, String word) {
        List<String> letterItems = new ArrayList<>(Arrays.asList(letter.toLowerCase().split("")));
        List<String> wordItems = new ArrayList<>(Arrays.asList(word.toLowerCase().split("")));

        if (letterItems.size() < wordItems.size()) {
            return false;
        } else {
            int count = 0;
            for (String w : wordItems) {
                if (letterItems.contains(w)) {
                    letterItems.remove(w);
                    count++;
                }
            }

            return count == wordItems.size();
        }
    }
}
//END
