package com.dmdev.cs.homew.raibow;

import java.util.Scanner;


public class Rainbow {
    private final Scanner scanner = new Scanner(System.in);
    private static final int RED_NUMBER = 1;
    private static final int BLUE_NUMBER = 2;
    private static final int GREEN_NUMBER = 3;
    private static final int YELLOW_NUMBER = 4;
    private static final int PURPLE_NUMBER = 5;
    private static final int CYAN_NUMBER = 6;
    private static final int PINK_NUMBER = 7;

    public void start() {
        printColor(RED_NUMBER);


    }

    public void printColor(int color) {
        if (color == 1) {
            System.out.println("Красный цвет");
        }
        else if (color == 2) {
            System.out.println("Синий цвет");
        }
        else if (color == 3) {
            System.out.println("Зеленый цвет");
        }
        else if (color == 4) {
            System.out.println("Желтый цвет");
        }
        else if (color == 5) {
            System.out.println("Пурпурный цвет");
        }
        else if (color == 6) {
            System.out.println("Голубой цвет");
        }
        else if (color == 7) {
            System.out.println("Розовый цвет");
        }else {
            System.out.println("такого цвета не существует!");
        }



    }


}


