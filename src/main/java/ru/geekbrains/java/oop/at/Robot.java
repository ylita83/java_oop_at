package ru.geekbrains.java.oop.at;

public class Robot implements JumpAndRun {
    private int maxJump = 0;
    private int maxRun = 500;

    public boolean jump(Wall wall) {
        System.out.println("Робот не прыгает и в цирке не выступает");
        return false;

    }

    public boolean run(Treadmill treadmill) {
        if (treadmill.length <= maxRun) {
            System.out.println("Робот добежал!");
            return true;
        } else {
            System.out.println("Робот нишмог пробежать :(");
            return false;
        }

    }
}
