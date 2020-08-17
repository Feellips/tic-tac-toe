package org.example;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class GameEngine {

    private static int currentTurn = 0;
    private static Field gameField;
    private static Queue<Player> players;

    public static void main(String[] args) {
        preparingStage();
        startGame();
    }

    private static void startGame() {
        Scanner input = new Scanner(System.in);
        while (currentTurn < gameField.getMaxTurns()) {

        }
    }

    private static void preparingStage() {
        gameField = new Field(5, 5);
        gameField.testFilling();
        drawField();

        players = new LinkedBlockingQueue<>();
        players.add(new Player('X'));
        players.add(new Player('O'));
    }

    public static void drawField() {


        for (int i = 0; i < gameField.getX(); i++) {
            for (int j = 0; j < gameField.getY(); j++) {
                System.out.print(gameField.getTable()[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

