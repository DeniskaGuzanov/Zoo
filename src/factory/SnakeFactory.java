package factory;

import animals.Snake;
import animals.Snake;

import java.util.ArrayList;

public class SnakeFactory {
    public static ArrayList<Snake> createSnake (int snakeCount){
        ArrayList<Snake> snakeInCage = new ArrayList<>(snakeCount);
        for (int i = 0; i < snakeCount; i++){
            Snake snake1  = new Snake(5, 25, 0, 7);
            Snake snake2  = new Snake(3, 22, 0, 4);
            Snake snake3  = new Snake(7, 28, 0, 5);
            snakeInCage.add(snake1);
            snakeInCage.add(snake2);
            snakeInCage.add(snake3);
        }
        return  snakeInCage;

    }
}
