package de.lubowiecki.playgroundoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UebungTest2 {

    public static void main(String[] args) throws Exception {

        List c = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for(final Object o : c) {
            // o += 10; // Nicht erlaubt, da final
            System.out.println(o);
        }

        System.out.println();

        int[] arr = null;
        //int i = arr[m1()];
    }

    static int m1() throws Exception {
        throw new Exception("Bla bla");
    }
}

interface I1 {
    int WERT = 1;
}

interface I2 {
    int WERT = 2;
}

class ConcreteI implements I1, I2 {

}