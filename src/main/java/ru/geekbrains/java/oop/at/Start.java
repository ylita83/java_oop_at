package ru.geekbrains.java.oop.at;

import java.lang.reflect.Array;

public class Start {
    public static void main(String[] args) {
        JumpAndRun [] creatures = new JumpAndRun[3];
        creatures[0] = new Cat();
        creatures[1] = new Human();
        creatures[2] = new Robot();
        Obstacle [] obstacles = new Obstacle[4];
        for (int i = 0; i < obstacles.length; i++) {
            if (Math.random()<0.6){
                int height = (int) (Math.random()*5);
                obstacles[i]= new Wall(height);
            } else {
                int length = (int) (Math.random()*600);
                obstacles[i]= new Treadmill(length);
            }
        }
        for (int i = 0; i < creatures.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
               if (!obstacles[j].overcome(creatures[i])){
                   System.out.println("Не смог пройти полосу препятствий");
                   break;
               }

            }
        }
    }
}
