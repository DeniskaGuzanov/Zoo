package cage;

import animals.Animal;

public interface AnimalCage<T extends Animal> {
    void addAnimalCage(T animal);
    void addFoodCage(int foodWeight);
    void clearCage();


    T getFirstAnimal();
    T getChooseAnAnimal(double animalParametr);





}
