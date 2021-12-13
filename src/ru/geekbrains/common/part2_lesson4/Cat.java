package ru.geekbrains.common.part2_lesson4;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Cat {
    private String name;
    private boolean satiety;

    private final int APPETITE = 10;

    public Cat (String name) {
        this.name = name;
        this.satiety = false;
    }

    public boolean eat (Plate plate) {
        if (plate.decreaseFood(APPETITE)){
            System.out.println("Cat " + name + " eat = ");
            satiety = true;
            return true;
        } else {
            System.out.println("Cat " + name + " not eat = ");
            return false;
        }
    }

    public String getName (){ return name; }

//    public void fear (Dog dog){
//        System.out.println("Cat = " + name + "fear dog " + dog.getName());
//    }

    public boolean isSatiety() { return satiety; }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}
