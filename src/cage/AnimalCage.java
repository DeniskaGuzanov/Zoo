package cage;

import animals.Animal;

public interface AnimalCage<T extends Animal> {
    void addAnimalCage(T animal);
    void addFoodCage(int foodWeight);
    void clearCage();

    Animal getFirstAnimal();




}
