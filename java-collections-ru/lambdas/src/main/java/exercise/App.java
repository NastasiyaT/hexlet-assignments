package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] images) {
        Function<String[], List<String[]>> mult = l -> {
            int halfLength = l.length;
            String[] multLine = new String[halfLength * 2];

            for (int n = 0; n < halfLength; n += 2) {
                multLine[n] = l[n];
                multLine[n + 1] = l[n];
            }

            List<String[]> multColumn = new ArrayList<>(2);

            multColumn.add(multLine);
            multColumn.add(multLine);

            return multColumn;
        };

        for (String[] s : images) {
            mult.apply(s);
        }

        return images;
    }
}
// END
