package exercise;

import java.util.*;
import java.time.LocalDate;
import java.util.function.Function;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        Function<String, LocalDate> birthday = LocalDate::parse;

        return users.stream()
                    .filter(s -> s.containsKey("male"))
                    .sorted(Comparator.comparing(date -> birthday.apply(date.toString())))
                    .map(n -> n.get("name"))
                    .collect(Collectors.toList());
    }
}
// END
