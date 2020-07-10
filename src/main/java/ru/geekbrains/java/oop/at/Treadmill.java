package ru.geekbrains.java.oop.at;

public class Treadmill implements Obstacle{
    public int length;

    public Treadmill(int length) {
        this.length = length;
    }


    public boolean overcome(JumpAndRun overcomer) {
        return overcomer.run(this);
    }
}
