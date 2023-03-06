package Zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;

public class AnimalZoo {
    private AnimalCage lionAnimalCage;
    private AnimalCage  snakeAnimalCage;
    private AnimalCage  wolfAnimalCage;

    public AnimalZoo(AnimalCage lionAnimalCage, AnimalCage snakeAnimalCage, AnimalCage wolfAnimalCage) {
        this.lionAnimalCage = lionAnimalCage;
        this.snakeAnimalCage = snakeAnimalCage;
        this.wolfAnimalCage = wolfAnimalCage;
    }

    @Override
    public String toString() {
        return "AnimalZoo{" +
                "lionAnimalCage=" + lionAnimalCage +
                ", snakeAnimalCage=" + snakeAnimalCage +
                ", wolfAnimalCage=" + wolfAnimalCage +
                '}';
    }

    public void addLion(Lion lion){
        this.lionAnimalCage.addAnimalCage(lion);
        System.out.println("Добавлен : " + lion);
    }
    public void  addSnake(Snake snake){
        this.snakeAnimalCage.addAnimalCage(snake);
        System.out.println("Добавлен : " + snake);
    }
    public void addWolf(Wolf wolf){
        this.wolfAnimalCage.addAnimalCage(wolf);
        System.out.println("Добавлен : " + wolf);
    }

    public Lion takeOutLion(double maneLion){
        return (Lion) this.lionAnimalCage.getFirstAnimal();}

    public Snake takeOutSnake(double lengthSnake){
        return (Snake) this.snakeAnimalCage.getFirstAnimal();
    }

    public Wolf takeOutWolf(double heightWolf){ return (Wolf) this.wolfAnimalCage.getFirstAnimal(); }


}
