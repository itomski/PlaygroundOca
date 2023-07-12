package uebung2;

import java.util.Random;

public class StaticDiceCup {

    private static final Random rand = new Random();

    public static int roll(int size) {
        return rand.nextInt(size) + 1;
    }

    public static int[] roll(int num, int size) {
        int[] arr = new int[num];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = roll(size);
        }

        return arr;
    }
}
