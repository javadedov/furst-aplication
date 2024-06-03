package com.dmdev.cs.home3;

import java.util.Random;

public class Cat {
    private String name  = "Барсик";
    private int age = 12;

    static final String[] CATS_NAME = new String[]{
            "Кот", "Барсик", "Кошак", "Китикэт", "Базилио", "Дворняга", "Малыш", "Антон", "Арнольд", "Мартин"
    };
    static Random rand = new Random();

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setRandomName() {
        name = CATS_NAME[rand.nextInt(10)];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setRandomAge() {
        age = rand.nextInt(28) + 1;
    }

    public void showCat() {
        System.out.println("Имя кота " + this.getName() + " , его возраст " + this.getAge() + "лет");


    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
