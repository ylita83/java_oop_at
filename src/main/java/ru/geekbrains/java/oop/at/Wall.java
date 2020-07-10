package ru.geekbrains.java.oop.at;

public class Wall implements  Obstacle{
    public int height;

    public Wall(int height) {
        this.height = height;
    }


    public boolean overcome(JumpAndRun overcomer) {
        return overcomer.jump(this);
    }
}
