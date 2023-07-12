package uebung2;

import java.util.Arrays;

public class DiceCupTest {

    public static void main(String[] args) {

        System.out.println(StaticDiceCup.roll(10));
        System.out.println(StaticDiceCup.roll(10));
        System.out.println(StaticDiceCup.roll(100));
        System.out.println(StaticDiceCup.roll(6));

        System.out.println();

        System.out.println(Arrays.toString(StaticDiceCup.roll(5, 10)));
        System.out.println(Arrays.toString(StaticDiceCup.roll(7, 20)));
        System.out.println(Arrays.toString(StaticDiceCup.roll(2, 30)));
        System.out.println(Arrays.toString(StaticDiceCup.roll(15, 50)));
        System.out.println(Arrays.toString(StaticDiceCup.roll(22, 100)));

        System.out.println();

        DiceCup w10 = new DiceCup(10);
        System.out.println(w10.roll());
        System.out.println(w10.roll());
        System.out.println(w10.roll());
        System.out.println(w10.roll());
        System.out.println(w10.roll());

        DiceCup w6 = new DiceCup(6);
        System.out.println(Arrays.toString(w6.roll(20)));
        System.out.println(Arrays.toString(w6.roll(20)));
        System.out.println(Arrays.toString(w6.roll(20)));
        System.out.println(Arrays.toString(w6.roll(20)));
        System.out.println(Arrays.toString(w6.roll(20)));

        System.out.println();

        int[] erg = w6.roll(10);
        System.out.println(Arrays.toString(erg));
        String out = w6.analyse(erg);
        System.out.println(out);

    }

}
