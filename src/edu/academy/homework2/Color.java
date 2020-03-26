package edu.academy.homework2;

public class Color {
    private int colorNum;

    private final static int RED = 1;
    private final static int ORANGE = 2;
    private final static int YELLOW = 3;
    private final static int GREEN = 4;
    private final static int BLUE = 5;
    private final static int DEEP_BLUE = 6;
    private final static int VIOLET = 7;

    public Color(int colorNumber) {
        this.colorNum = colorNumber;
    }

    public int getNumber() {
        return colorNum;
    }

    public String getName() {
        String colorName;

        switch (colorNum) {
            case RED:
                colorName = "Красный";
                break;
            case ORANGE:
                colorName = "Оранжевый";
                break;
            case YELLOW:
                colorName = "Желтый";
                break;
            case GREEN:
                colorName = "Зеленый";
                break;
            case BLUE:
                colorName = "Голубой";
                break;
            case DEEP_BLUE:
                colorName = "Синий";
                break;
            case VIOLET:
                colorName = "Фиолетовый";
                break;
            default:
                colorName = "неизвестно";
                break;
        }

        return colorName;
    }
}
