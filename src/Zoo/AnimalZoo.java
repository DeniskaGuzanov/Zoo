package Zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;

public class AnimalZoo {

    public Lion getFirstLion(){
       return this.lionAnimalCage.getFirstAnimal();

    }


    private AnimalCage<Lion> lionAnimalCage;
    private AnimalCage<Snake> snakeAnimalCage;
    private AnimalCage<Wolf> wolfAnimalCage;

}
