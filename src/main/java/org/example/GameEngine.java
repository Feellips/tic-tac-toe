package org.example;

/**
 * Hello world!
 */
public class GameEngine {
    public static void main(String[] args) {
        Field field = new Field(3, 3);
        field.testFilling();
        drawField(field);
    }

    public static void drawField(Field field) {
        char[][] table = field.getTable();

        for (int i = 0; i < field.getX(); i++) {
            for (int j = 0; j < field.getY(); j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
}

