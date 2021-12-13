package ru.geekbrains.common.part2_lesson4;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public boolean decreaseFood(int amount){
        if(food >= amount){
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public int getFood(){
        return food;
    }
}
