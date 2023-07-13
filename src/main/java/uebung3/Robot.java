package uebung3;

public class Robot {

    private String name;

    private int x;

    private int y;

    private Board board;

    public Robot(String name, int x, int y, Board board) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.board = board;
        board.setBot(this);
    }

    public Robot(String name, Board board) {
        this(name, 0, 0, board); // Verwendet den Konstruktor aus Zeile 13
    }

    public void moveUp() {
        move('y', false);
    }

    public void moveDown() {
        move('y', true);
    }

    public void moveLeft() {
        move('x', false);
    }

    public void moveRight() {
        move('x', true);
    }

    private void move(char dir, boolean forward) {

        int oldX = x;
        int oldY = y;

        if(dir == 'x') {
            if(forward) x++; else x--;
        }
        else if(dir == 'y') {
            if(forward) y++; else y--;
        }

        if(!board.setBot(this)) {
            System.out.println("geht nicht!");
            x = oldX; y = oldY; // Bewegung wird rückgängig gemacht
            board.setBot(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
