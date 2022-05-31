package challengesmethods;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ValueComparator bvc = new ValueComparator(map);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);

        map.put("A", 9);
        map.put("B", 6);
        map.put("C", 8);
        map.put("D", 1);

        System.out.println("unsorted map: " + map);
        sorted_map.putAll(map);
        sorted_map.descendingKeySet();
        System.out.println("results: " + sorted_map);
    }
}

class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;

    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with
    // equals.
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}
