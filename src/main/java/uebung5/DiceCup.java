package uebung5;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public class DiceCup {

    private final IntSupplier rand;

    public DiceCup(IntSupplier rand) {
        this.rand =rand;
    }

    public int roll() {
        return rand.getAsInt();
    }

    public int[] roll(int num) {
        int[] arr = new int[num];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = roll();
        }

        return arr;
    }

    public String analyse(int[] arr) {

        int max = Collections.max(Arrays.asList());

        int[] analysis = new int[max];

        for(int value : arr) {
            analysis[value - 1]++; // Die Anzahl an der Position der Augen wird erhöht
        }

        String output = "";
        for(int i = 0; i < analysis.length; i++) {
           output += (i + 1) + " kommt " + analysis[i] + " mal vor \n";
        }

        return output;
    }

    public void print(int[] rollResults, IntConsumer cons) {
        //Arrays.stream(arr).forEach(cons);
        for (int result: rollResults) {
            cons.accept(result);
        }
    }
}
