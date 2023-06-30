package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> items1, Map<String, Object> items2) {
        LinkedHashMap<String, String> differences = new LinkedHashMap<>();

        TreeSet<String> keys = new TreeSet<>();
        keys.addAll(items1.keySet());
        keys.addAll(items2.keySet());

        for (String k : keys) {
            if (!items1.containsKey(k) && items2.containsKey(k)) {
                differences.put(k, "added");
            } else if (items1.containsKey(k) && !items2.containsKey(k)) {
                differences.put(k, "deleted");
            } else if (!items1.get(k).equals(items2.get(k))) {
                differences.put(k, "changed");
            } else if(items1.get(k).equals(items2.get(k))) {
                differences.put(k, "unchanged");
            }
        }

        return differences;
    }
}
//END
