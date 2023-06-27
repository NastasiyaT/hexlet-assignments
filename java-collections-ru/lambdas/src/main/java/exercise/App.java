package exercise;

import java.util.Arrays;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] images) {
        var row = images[0].length * 2;
        var column = images.length * 2;
        String[][] newRows = new String[column / 2][row];

        for (String[] i : images) {
            for (String[] nI : newRows) {
                Arrays.stream(i)
                        .forEach(t -> {
                            int m = 0;
                            nI[m] = t;
                            nI[m + 1] = t;
                            m += 2;
                        });
            }
        }

        String[][] newImages = new String[column][row];

        Arrays.stream(newRows)
                .forEach(e -> {
                    int p = 0;
                    newImages[p] = e;
                    newImages[p + 1] = e;
                    p += 2;
                });

        return newImages;
    }
}
// END
