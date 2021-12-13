package ru.geekbrains.common.part2_lesson4;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Poloska"),
                new Cat("Poloska2"),
                new Cat("Poloska3"),
                new Cat("Poloska4"),
                new Cat("Poloska5")
        };

        Plate plate = new Plate(33);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
    }
}
