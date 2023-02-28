package cage;

import animals.Animal;
import animals.LionComparator;
import animals.Snake;
import animals.Wolf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SnakeCage implements AnimalCage<Snake>{

    private int volumeOfGarbage;
    private ArrayList snake;
    private int snakeCount;
    protected  static final int MAX_CLEAN_CAGE = 20;

    public SnakeCage(ArrayList<Snake> snake) {
        this.snake = snake;
        snakeCount = snake.size();
        volumeOfGarbage = this.snakeCount;
    }

    public int getVolumeOfGarbage() {
        return volumeOfGarbage;
    }

    public int getSnakeCount() {
        return snakeCount;
    }

    public ArrayList getSnake() {
        return snake;
    }

    public void setSnake(ArrayList snake) {
        this.snake = snake;
    }

    @Override
    public String toString() {
        return "SnakeCage{" +
                "volumeOfGarbage=" + volumeOfGarbage+
                ", snake=" + snake +
                ", snakeCount=" + snakeCount +
                '}';
    }

    @Override
    public void addAnimalCage(Snake snakes) {
        snake.add((Snake) snakes);
        snakeCount++;
        volumeOfGarbage += 3;

    }

    @Override
    public void addFoodCage(int foodWeight) {

        volumeOfGarbage = volumeOfGarbage + foodWeight;
    }

    @Override
    public void clearCage() {

        if(volumeOfGarbage > MAX_CLEAN_CAGE){
            volumeOfGarbage = 0;
            System.out.println("Клетка очищена");
        }else {
            System.out.println("Клетка не гряная");
        }
    }

    @Override
    public Snake getFirstAnimal() {
        if (this.snake == null) {
            System.out.println("Пустая клетка");
            return null;

        } else {
            Random random = new Random();
            int snakeRandom = (int) (Math.random() * (this.snake.size()));
            Snake snake1 = (Snake) this.snake.get(snakeRandom);
            this.snake.remove(snake1);
            System.out.println("Достали эмею из клетки" + snakeRandom);
            return snake1;
        }

    }
    public  void  sortLions(){
        Collections.sort(snake);
    }
    public void sortByVolume(){
        Collections.sort(snake, new LionComparator());
    }
}
