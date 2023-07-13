package uebung3;

import java.util.Scanner;

public class App {

    private final Scanner scanner = new Scanner(System.in);

    private Board board;

    private Robot bot;

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {
        //...
        board = new Board(10);

        bot = new Robot("R2-D2", board);

        String input;

        while(true) {

            System.out.print("Eingabe: ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Programmende");
                break;
            }
            else {
                String[] commands = input.split("");
                for (String command : commands) {

                    switch (command) {
                        case "u":
                            bot.moveUp();
                            break;
                        case "d":
                            bot.moveDown();
                            break;

                        case "r":
                            bot.moveRight();
                            break;

                        case "l":
                            bot.moveLeft();
                            break;
                    }
                }
                board.print();
            }
        }
    }
}
