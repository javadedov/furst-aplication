package com.dmdev.cs.home3;

import java.util.Random;

public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        int counter = 0;
        while (counter < 10) {
            Random rand = new Random();
            cat.showCat();
            counter++;
        }
        System.out.println();

        do {
            Random rand = new Random();
            cat.setRandomName();
            cat.setRandomAge();
            cat.showCat();
            counter--;
        } while (counter > 0);
        System.out.println();

        for (counter = 0; counter < 10; counter++) {
            cat.setRandomName();
            cat.setRandomAge();
            cat.showCat();
        }
        System.out.println();

        String[] string = new String[5];
        string[0] = "Арнольд";
        string[1] = "Бишоп";
        string[2] = "Рафаель";
        string[3] = "Афродита";
        string[4] = "Емеля";

        for (String string1 : string) {
            System.out.println(string1);
        }


    }
}
