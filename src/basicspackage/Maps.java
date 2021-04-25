package basicspackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {    //  Collection with unique keys and values
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Yellow");
        map.put(10, "Green");

        System.out.println(map.get(1));
        System.out.println(map.get(10));

        System.out.println(map.containsKey(90));
        System.out.println(map.containsKey(10));
        System.out.println(map.containsValue("White"));
        System.out.println(map.containsValue("Grey"));

        Set<Integer> keys = map.keySet();   //  set of integer keys. Method keySet allows to get values of all keys
        Iterator<Integer> iterator = keys.iterator();   //  iterator of integer type
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));   // go through all keys and show all values in map by key
        }

        System.out.println(map.get(2));
        map.put(2, "Yellow");   //  change existing value
        System.out.println(map.get(2));

        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Vasya", "Frolov");
        map2.put("Petya", "Gromov");
        System.out.println(map2.get("Petya"));

    }
}
