package basicspackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {    //  collection for storing unique objects
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(11);

        System.out.println(set.size());

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        for (int i : set) {
            System.out.println(i);
        }

        set.remove(11);
        //set.clear();

        System.out.println(set.contains(10));
        System.out.println(set.contains(11));

    }
}
