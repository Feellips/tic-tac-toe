package org.example;

public class Field {

    private static int x;
    private static int y;
    private static int maxTurns;

    private static char[][] table;

    public Field(int x, int y) {
        Field.x = x;
        Field.y = y;
        Field.table = new char[x][y];
        maxTurns = x * y;
    }

    public static int getMaxTurns() {
        return maxTurns;
    }

    public void testFilling() {

        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                table[i][j] = '_';

        for (int i = 0; i < x; i++)
            table[i][0] = '|';

        for (int i = 0; i < y; i++)
            table[i][x - 1] = '|';

        for (int i = 0; i < x; i++)
            table[0][i] = '-';

        for (int i = 0; i < y; i++)
            table[y - 1][i] = '-';



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
