package de.lubowiecki.playgroundoca;

public class VariablenTest {

    final int x;

    final static int y;

    static {
        y = 0;
    }

    static int i, j = 10, k = i + j, l = 10;

    public VariablenTest() {
        String s = "Moin";
        x = 0;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.setLength(10);
        sb.append(2);
        System.out.println(sb);

        // long[] arr1 = new int[10]; // int is not long
        // Object[] arr2 = new String[10]; // String is a Object
        // Number[] arr3 = new Integer[10]; // Integer is a Number

    }
}
