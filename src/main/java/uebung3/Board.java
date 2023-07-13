package uebung3;

import java.util.Arrays;

public class Board {

    private final String[][] fields;

    public Board(int size) {
        this.fields = new String[size][size];
    }

    public Board(int sizeX, int sizeY) {
        this.fields = new String[sizeX][sizeY];
    }

    public boolean setBot(Robot bot) {
        clear(); // Alte Positon löschen

        try {
            fields[bot.getY()][bot.getX()] = "@";
        }
        catch(Exception e) {
            return false;
        }
        return true;
    }

    public void print() {
        for(String[] row : fields) {
            for(String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void clear() {
        for(int i = 0; i < fields.length; i++) {
            Arrays.fill(fields[i], "X");
        }
    }
}
