package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String config) {
        String command = "environment";
        String prefix = "X_FORWARDED_";

        String[] items = config.lines()
                .filter(n -> n.startsWith(command))
                .map(k -> k.substring(command.length()).replaceAll("\"", "").split(","))
                .flatMap(Arrays::stream)
                .filter(x -> x.startsWith(prefix))
                .toArray(String[]::new);

        return Arrays.toString(items).replaceAll(prefix, "").replaceAll(" ", "");
    }
}
//END
