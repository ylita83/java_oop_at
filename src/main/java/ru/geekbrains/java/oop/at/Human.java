package ru.geekbrains.java.oop.at;

public class Human implements JumpAndRun {
    private int maxJump = 1;
    private int maxRun = 300;
    public boolean jump(Wall wall) {
        if (wall.height <= maxJump){
            System.out.println("Человек перепрыгивает стену по-человечьи");
            return true;
        } else {
            System.out.println("Человек нишмог перепрыгнуть:(");
            return false;
        }


    }

    public boolean run(Treadmill treadmill) {
        if (treadmill.length <= maxRun){
            System.out.println("Человек добежал!");
            return true;
        } else {
            System.out.println("Человек нишмог пробежать :(");
            return false;
        }

    }
}
