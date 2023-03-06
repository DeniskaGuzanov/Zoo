import Zoo.AnimalZoo;
import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;
import java.util.List;

import static factory.LionsFactory.createLions;
import static factory.SnakeFactory.createSnake;
import static factory.WolfFactory.createWolf;

public class Main {
    public static void main(String[] args) {


        List<Lion> lionList = createLions(1);
        LionCage lionCage = new LionCage(lionList);
        System.out.println(lionCage);
        lionCage.sortLions();
        System.out.println(lionCage);

        List<Snake> snakeList = createSnake(1);
        SnakeCage snakeCage = new SnakeCage(snakeList);
        System.out.println(snakeCage);
        snakeCage.sortByBodyLength();
        System.out.println(snakeCage);

        List<Wolf> wolfList = createWolf(1);
        WolfCage wolfCage = new WolfCage((wolfList));
        System.out.println(wolfCage);
        wolfCage.sortWeight();
        System.out.println(wolfCage);

        AnimalZoo animalZoo = new AnimalZoo(lionCage, snakeCage, wolfCage);



    }
}
