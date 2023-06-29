package exercise;

import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static String getForwardedVariables(String config) {
        String command = "environment=";
        String prefix = "X_FORWARDED_";

        String[] items = config.lines()
                .filter(x -> x.startsWith(command))
                .map(y -> y.substring(command.length()).replaceAll("\"", "").split(","))
                .flatMap(Arrays::stream)
                .filter(z -> z.startsWith(prefix))
                .toArray(String[]::new);

        String result = Arrays.toString(items);

        return result.substring(1, result.length() - 1).replaceAll(prefix, "").replaceAll(" ", "");
    }
}
//END
