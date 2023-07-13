package de.lubowiecki.playgroundoca;

public class OperatorTest2 {

    public static void main(String[] args) {

        int alter = 17;

        String str;

        if(alter > 18) {
            //System.out.println("alt genug");
            str = "alt genug";
        }
        else {
            //System.out.println("zu jung");
            str = "zu jung";
        }

        System.out.println("Du bist " + str);

        // Wenn WAHR  ?  DANN   :  SONST
        // (alter > 18) ? "alt genug" : "zu jung")

        System.out.println("Du bist " + ((alter > 18) ? "alt genug" : "zu jung"));

        System.out.println();

        int a = 100;
        int b = 2;
        int sum = a + ++b; // prefix: sum 103
        //b: 3

        a = 100;
        b = 2;
        sum = a + b++; // postfix: sum 102
        //b: 3

        a = 100;
        b = 2;
        b = a + ++b; // postfix: b 103


        a = 100;
        b = 2;
        b = a + b++; // postfix: b 102, das postfix geht verloren, da die Variable neu zugewiesen wurde

        b = 2;

        //      3 + 3   + 4   +   4 + 4
        sum = ++b + b++ + b-- + ++b + b++;
        // b: 5
        System.out.println(sum); // 18

        a = 100;

        System.out.println(a >= 100 ? a >= 150 ? "ÜBER 150" : "ÜBER 100" : "UNTER 100");
    }
}
