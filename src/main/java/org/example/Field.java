package org.example;

public class Field {

    private static int x;
    private static int y;

    private static char[][] table;

    public Field(int x, int y) {
        Field.x = x;
        Field.y = y;
        Field.table = new char[x][y];
    }


    public static int getY() {
        return y;
    }

    public static int getX() {
        return x;
    }

    public static char[][] getTable() {
        return table;
    }

    public static void setCell(int x, int y, Player player) {
        Field.table[x][y] = player.getSign();
    }
}
