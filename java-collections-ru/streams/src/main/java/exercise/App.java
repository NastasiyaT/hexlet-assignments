package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        if (!emails.isEmpty()) {
            long count1 = emails.stream()
                    .filter(email -> email.contains("gmail.com"))
                    .count();

            long count2 = emails.stream()
                    .filter(item -> item.contains("yandex.ru"))
                    .count();

            long count3 = emails.stream()
                    .filter(str -> str.contains("hotmail.com"))
                    .count();

            long count = count1 + count2 + count3;
            return (int) count;
        } else {
            throw new Error("Error: list is empty");
        }
    }
}
// END
