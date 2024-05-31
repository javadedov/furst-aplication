package com.dmdev.cs.homew.nikita.runner;

import com.dmdev.cs.homew.raibow.Rainbow;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    int x = 2;


    public static void main(String[] args) {
        Rainbow rainbow = new Rainbow();
        rainbow.start();
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        System.out.println(" Введите второе число ");
        String y = scanner.nextLine();



    }

}
