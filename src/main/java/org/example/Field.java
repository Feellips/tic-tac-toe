package org.example;

public class Field {

    private static int x;
    private static int y;

    public Field(int x, int y) {
        Field.x = x;
        Field.y = y;
    }

    public static int getY() {
        return y;
    }

    public static int getX() {
        return x;
    }
}
