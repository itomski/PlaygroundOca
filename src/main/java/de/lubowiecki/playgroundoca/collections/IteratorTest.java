package de.lubowiecki.playgroundoca.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        for(int i = 0; i < zahlen.size(); i++) {
            System.out.println(zahlen.remove(i));
        }

        System.out.println();

        List<String> namen = new ArrayList<>(Arrays.asList("Peter", "Carol", "Bruce", "Tony", "Steve", "Natasha"));

        for(String n : namen) {
            System.out.println(zahlen.remove(n));
        }

        System.out.println();

        Iterator<String> itr = namen.iterator();
        while(itr.hasNext()) {
            String e = itr.next();
            System.out.println(e);
            itr.remove();
        }

        System.out.println();

        zahlen = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        Iterator<Integer> itr2 = zahlen.iterator();
        while(itr2.hasNext()) {
            Integer e = itr2.next();
            System.out.println(e);
            itr2.remove();
        }
    }
}
