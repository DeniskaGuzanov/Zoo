package cage;

import animals.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SnakeCage implements AnimalCage<Snake>{

    private int volumeOfGarbage;
    private List<Snake> snake;
    private int snakeCount;
    protected  static final int MAX_CLEAN_CAGE = 20;

    public SnakeCage(List<Snake> snake) {
        this.snake = snake;
        snakeCount = snake.size();
        volumeOfGarbage = snakeCount * 3;
    }

    public int getVolumeOfGarbage() {
        return volumeOfGarbage;
    }

    public int getSnakeCount() {
        return snakeCount;
    }

    public List<Snake> getSnake() {
        return snake;
    }

    public void setSnake(List snake) {
        this.snake = snake;
    }

    @Override
    public String toString() {
        return "SnakeCage{" +
                "volumeOfGarbage=" + volumeOfGarbage+
                ", snake=" + snake +
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

    @Override
    public Snake getChooseAnAnimal(double animalParametr) {
        Snake animalSnake;
        int temp = -1;
        for (int i = 0; i < this.snake.size(); i++) {
            if (this.snake.get(i).getBodyLength() == animalParametr) {
                temp = i;
                break;
            }
        }
        if (temp == -1) {
            System.out.println("Змеи такой длины нет в клетке");
            return null;
        } else {
            animalSnake = snake.get(temp);
            snake.remove(temp);
            return animalSnake;
        }

    }

    public  void  sortSnake(){
        Collections.sort(snake);
    }
    public void sortByBodyLength(){
        Collections.sort(snake, new SnakeComparator());
    }
}
