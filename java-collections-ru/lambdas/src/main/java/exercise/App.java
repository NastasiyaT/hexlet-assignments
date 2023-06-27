package exercise;

import java.util.Arrays;

// BEGIN
public class App {
    public static String[] duplicateValues(String[] items) {
        return Arrays.stream(items)
                .flatMap(item -> Arrays.stream(new String[] {item, item}))
                .toArray(String[]::new);
    }

    public static String[][] enlargeArrayImage(String[][] chars) {
        String[][] doubleRows = Arrays.stream(chars)
                .map(App::duplicateValues)
                .toArray(String[][]::new);

        return Arrays.stream(doubleRows)
                .flatMap(issue -> Arrays.stream(new String[][] {issue, issue}))
                .toArray(String[][]::new);
    }
}
// END
