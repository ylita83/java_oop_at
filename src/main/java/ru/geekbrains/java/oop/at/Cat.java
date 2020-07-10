package ru.geekbrains.java.oop.at;

public class Cat implements JumpAndRun {
    private int maxJump = 3;
    private int maxRun = 200;
    public boolean jump(Wall wall) {
        if (wall.height <= maxJump){
            System.out.println("Кот перепрыгивает стену по-кошачьи");
            return true;
        } else {
            System.out.println("Кот нишмог перепрыгнуть:(");
            return false;
        }


    }

    public boolean run(Treadmill treadmill) {
        if (treadmill.length <= maxRun){
            System.out.println("Кот добежал!");
            return true;
        } else {
            System.out.println("Кот нишмог пробежать :(");
            return false;
        }

    }
}
