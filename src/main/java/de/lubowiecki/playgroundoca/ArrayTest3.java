package de.lubowiecki.playgroundoca;

public class ArrayTest3 {

    public static void main(String[] args) {

        // Max. Größe des Arrays ist Integer.MAX_VALUE
        // int[] arr1 = new int[-10]; // NegativeArraySizeException
        // int[] arr1 = new int[10_000_000_000]; // Size ist kein gültiger Integer-Wert
        System.out.println(Integer.MAX_VALUE);

        int[] arr1 = new int[10];
        System.out.println(arr1[0]);
        // System.out.println(arr1[10]); // ArrayIndexOutOfBoundsException
        // arr1[100] = 200; // ArrayIndexOutOfBoundsException

        int size = 2000;
        int[] arr2 = new int[size];
        arr2[size - 1] = 200;


        int[][] arr3 = new int[2][]; // Größe der ersten Dimension MUSS vorgegeben werden
        // {null, null}

        // System.out.println(arr3[0][1]); // NullPointerException das Array auf 0 ist eine Null-Referenz

        arr3[0] = new int[5];
        // {{0,0,0,0,0}}, null}
        arr3[1] = new int[10];
        // {{0,0,0,0,0}}, {0,0,0,0,0,0,0,0,0,0}}

        int[][] arr4 = {{1,2,3}, {4}, {5,6,7,8,9},{}};

        Object o1= new Object();
        Object o2 = new Object();

        System.out.println(o1.equals(o2));
        System.out.println(o1 == o2);

        System.out.println();

        NextStudent s1 = new NextStudent();
        s1.setVorname("Peter").setNachname("Parker");

        NextStudent s2 = new NextStudent();
        s2.setVorname("Peter").setNachname("Parker");

        System.out.println(s1.equals(s2)); // Will man einen ECHTEN Inhaltsvergleich muss die equals-Methode überschrieben werden
        System.out.println(s1 == s2);
    }
}
