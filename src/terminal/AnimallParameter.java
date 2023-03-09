package terminal;

import java.util.ArrayList;
import java.util.List;

import static terminal.AnimalCommand.*;
import static terminal.InputAnimal.numberMenu;

public class AnimallParameter {
    public static List<Integer> menuAnimal() {

        List<Integer> commandParameters = new ArrayList<Integer>();
        chooseAddDelMenu();

        int userCommandAddDel = numberMenu(1, 3);
        if (userCommandAddDel == 3) {
            menuExceptionMessage();
            System.exit(1);
        }
        chooseAnimalMenu();

        int chosenAnimal = numberMenu(1, 3);
        commandParameters.add(chosenAnimal);
        commandParameters.add(userCommandAddDel);
        requestAdditionalParameterMenu(chosenAnimal);
        commandParameters.add(numberMenu(0, 10));

        if (userCommandAddDel == 1) {
            requestAnimalAgeMenu();
            commandParameters.add(numberMenu(0, 30));
            requestAnimalWeightMenu();
            commandParameters.add(numberMenu(0, 200));
            requestAnimalCountLimbsMenu();
            commandParameters.add(numberMenu(0, 4));
        }

        return commandParameters;
    }

    private static void menuExceptionMessage() {
        System.out.println("End");
    }

}

