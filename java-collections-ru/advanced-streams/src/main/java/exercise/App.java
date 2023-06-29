package exercise;

import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static String getForwardedVariables(String config) {
        String command = "environment=";
        String prefix = "X_FORWARDED_";

        return config.lines()
                .filter(x -> x.startsWith(command))
                .map(y -> y.substring(command.length()).replaceAll("\"", "").split(","))
                .flatMap(Arrays::stream)
                .filter(z -> z.startsWith(prefix))
                .map(l -> l.substring(prefix.length()))
                .collect(Collectors.joining(","));
    }
}
//END
