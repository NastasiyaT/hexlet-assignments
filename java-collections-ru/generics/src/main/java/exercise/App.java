package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
public class App {
    public static List<Map<String, String>>
    findWhere(List<Map<String, String>> bookList, Map<String, String> itemList) {
        List<Map<String, String>> foundBooks = new ArrayList<>();

        for (Map<String, String> book: bookList) {
            for (Map.Entry<String, String> parameter : book.entrySet()) {
                if (parameter.equals(itemList.entrySet())) {
                    foundBooks.add(book);
                }
            }
        }

        return foundBooks;
    }
}
//END
