package exercise;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
public class App {
    public static List<Map<String, String>>
    findWhere(List<Map<String, String>> bookList, Map<String, String> itemList) {
        List<Map<String, String>> foundBooks = new ArrayList<>();

        for (Map<String, String> book: bookList) {
            if (book.entrySet().containsAll((Collection<?>) itemList)) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }
}
//END
