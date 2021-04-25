package basicspackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsIterators {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();   //  dynamic array

        list.add(5);
        list.add(10);
        list.add(9);

        System.out.println(list.get(1));
        System.out.println(list.get(0));

        int a = list.get(2);

        System.out.println(list.get(1));
        System.out.println(a);

        list.set(2, 100);
        System.out.println(list.get(2));

        System.out.println(list.get(1));
        list.remove(1); //  List with values will be shifted
        System.out.println(list.get(1));

        System.out.println(list.size());
        list.add(9);
        System.out.println(list.size());

        //  list.clear();

        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(56);

        System.out.println();
        System.out.println(list.size());
        list.addAll(list2);
        System.out.println(list.size());

        list.removeAll(list2);
        System.out.println(list.size());

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

        System.out.println();
        System.out.println(list.contains(100));
        System.out.println(list.contains(98));

        System.out.println();
        list.addAll(list2);
        System.out.println(list.containsAll(list2));
        list.removeAll(list2);
        System.out.println(list.containsAll(list2));

        Iterator<Integer> iterator = list.iterator();
        /*System.out.println(iterator.next());   //  points to the first element of the list
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());*/
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

