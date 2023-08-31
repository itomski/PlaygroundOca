package de.lubowiecki.playgroundoca;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    int a;
    //static int a;

    public static void main(String[] args) {

        List l1 = new ArrayList();

        try {
            while (true) {
                l1.add("ABC");
            }
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(l1.size());

        // String String = "Hallo";
        // String.substring()




    }
}
