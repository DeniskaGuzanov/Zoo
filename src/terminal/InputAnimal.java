package terminal;

import java.util.Scanner;

import static terminal.MessageException.menuExceptionMaxValue;
import static terminal.MessageException.menuExceptionMinValue;

public class InputAnimal {

    public static Integer numberMenu(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        while (num == - 1 && num > max){
            try {
                num = Integer.parseInt(scanner.next());
                if(num > max) {
                    menuExceptionMaxValue(max);
                    System.out.println("Значение больше " + max);
                    num = -1;
                }else if (num < min) {
                    menuExceptionMinValue(min);
                    System.out.println("Значение меньше " + min);
                    num = -1;
                }
            }catch (Exception e) {
                exceptionParsing();
                num = -1;
            }
        }

        return num;
    }

    private static void exceptionParsing() {
        System.out.println("Неправильная комманда");
    }
}
