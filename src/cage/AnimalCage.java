package cage;

import animals.Animal;

public interface AnimalCage {
    int addAnimalCage(Animal animal);
    int addFoodCage(int foodWeight);
    int clearCage();

    Animal getFirstAnimal();




}
