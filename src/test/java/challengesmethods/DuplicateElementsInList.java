package challengesmethods;

import java.util.*;

public class DuplicateElementsInList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(4);
        integerList.add(4);
        integerList.add(2);
        integerList.add(4);
        integerList.add(20);
        integerList.add(20);


        list.add("English");
        list.add("German");
        list.add("Spanish");
        list.add("Arabic");
        list.add("French");
        list.add("French");
        list.add("Algerian");
        list.add("Algerian");
        list.add("Algerian");
        list.add("Algerian");
        list.add("Algerian");

//        duplicateElementsStreams(list);
//        duplicateElementsLambdaExpression(list);
//        duplicateElementsUsingSetCollection(list);
//        duplicateElementsForIntegers(integerList);
//        duplicateElementsUsingIteratorClass(list);
//        duplicateElementsUsingEntrySetGenericsForLoop(list);
//        duplicateElementsMapEntryForLoop(list);
//        duplicateElementsIteratorKeySet(list);
        duplicateElementsUsingHashSet(list);
    }

    public static List<String> duplicateElementsUsingSetCollection(List<String> list) {
        HashMap<String, Integer> hashList = new HashMap<>();
        for (String listItems : list) {
            if (!hashList.containsKey(listItems)) {
                hashList.put(listItems, 1);
            } else {
                hashList.put(listItems, hashList.get(listItems) + 1);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = hashList.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                String key = entry.getKey();
                int value = entry.getValue();
                System.out.println("duplicateElementsUsingSetCollection");
                System.out.format("%s = %s %n", key, value);
            }
        }

        return list;
    }

    public static List<Integer> duplicateElementsForIntegers(List<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer listItems : list) {
            if (!map.containsKey(listItems)) {
                map.put(listItems, 1);
            } else {
                map.put(listItems, map.get(listItems) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("duplicateElementsForIntegers");
                System.out.println(entry.getKey());
            }
        }
        return list;
    }

    public static List<String> duplicateElementsUsingEntrySetGenericsForLoop(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String listItems : list) {
            if (!map.containsKey(listItems)) {
                map.put(listItems, 1);
            } else {
                map.put(listItems, map.get(listItems) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value > 1) {
                System.out.println("duplicateElementsUsingEntrySetGenericsForLoop");
                System.out.format("%s :%s%n", key, value);
            }
        }
        return list;
    }

    public static List<String> duplicateElementsStreams(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String listItems : list) {
            if (!map.containsKey(listItems)) {
                map.put(listItems, 1);
            } else {
                map.put(listItems, map.get(listItems) + 1);
            }
        }
        map.entrySet().stream().forEach((entry) -> {
            String key = entry.getKey();
            int value = entry.getValue();
            if (entry.getValue() > 1) {
                System.out.println("duplicateElementsStreams");
                System.out.format("%s = %s %n", key, value);
            }
        });
        return list;
    }

    public static List<String> duplicateElementsLambdaExpression(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String listItems : list) {
            if (!map.containsKey(listItems)) {
                map.put(listItems, 1);
            } else {
                map.put(listItems, map.get(listItems) + 1);
            }
        }
        map.forEach((key, value) -> {
            if (value > 1) {
                System.out.format("%s = %s %n", key, value);
            }
        });

        return list;
    }

    public static List<String> duplicateElementsMapEntryForLoop(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String listItems : list) {
            if (!map.containsKey(listItems)) {
                map.put(listItems, 1);
            } else {
                map.put(listItems, map.get(listItems) + 1);
            }
        }
        for (Map.Entry maps : map.entrySet()) {
            String key = (String) maps.getKey();
            int value = (int) maps.getValue();
            if (value > 1) {
                System.out.println("duplicateElementsMapEntryForLoop");
                System.out.format("%s = %s %n", key, value);
            }
        }
        return list;
    }

    public static List<String> duplicateElementsIteratorKeySet(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String listItems : list) {
            if (!map.containsKey(listItems)) {
                map.put(listItems, 1);
            } else {
                map.put(listItems, map.get(listItems) + 1);
            }
        }
        Iterator<String> iteratorKeySet = map.keySet().iterator();
        while (iteratorKeySet.hasNext()) {
            String key = iteratorKeySet.next();
            int value = map.get(key);
            if (value > 1) {
                System.out.println("duplicateElementsIteratorKeySet");
                System.out.format("%s = %s %n", key, value);
            }
        }
        return list;
    }

    public static List<String> duplicateElementsUsingIteratorClass(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String listItems : list) {
            if (!map.containsKey(listItems)) {
                map.put(listItems, 1);
            } else {
                map.put(listItems, map.get(listItems) + 1);
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry m = (Map.Entry) it.next();
            String key = (String) m.getKey();
            int value = (Integer) m.getValue();
            if (value > 1) {
                System.out.println("duplicateElementsUsingIteratorClass");
                System.out.format("%s = %s %n", key, value);
            }
        }
        return list;
    }

    public static List<String> duplicateElementsUsingHashSet(List<String> list) {
        HashSet<String> hashSet = new HashSet<>();
        for (String x : list) {
            if (!hashSet.add(x) && !hashSet.add(x) == true) {
                System.out.println(x);
            }
        }
        return list;
    }
}
