package uebung2;

import java.util.Random;

public class DiceCup {

    private final Random rand = new Random();

    private int size;

    public DiceCup(int size) {
        this.size = size;
    }

    public int roll() {
        return rand.nextInt(size) + 1;
    }

    public int[] roll(int num) {
        int[] arr = new int[num];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = roll();
        }

        return arr;
    }

    public String analyse(int[] arr) {
        int[] analysis = new int[size];

        for(int value : arr) {
            analysis[value - 1]++; // Die Anzahl an der Position der Augen wird erhöht
        }

        String output = "";
        for(int i = 0; i < analysis.length; i++) {
           output += (i + 1) + " kommt " + analysis[i] + " mal vor \n";
        }

        return output;
    }
}
