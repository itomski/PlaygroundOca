package uebung5;

import java.util.function.IntSupplier;

public interface RandUtils {

    IntSupplier W6 = createSupplier(6);
    IntSupplier W10 = createSupplier(10);
    IntSupplier W20 = createSupplier(20);
    IntSupplier W100 = createSupplier(100);

    static IntSupplier createSupplier(int size) {
        return () -> (int)(Math.random() * size) + 1;
    }
}
