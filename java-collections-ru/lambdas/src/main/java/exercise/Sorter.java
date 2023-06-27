package exercise;

import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.time.LocalDate;
import java.util.function.Function;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(n -> n.containsValue("male"))
                .sorted(Comparator.comparing(i -> LocalDate.parse(i.get("birthday"))))
                .map(k -> k.get("name"))
                .collect(Collectors.toList());
    }
}
// END
