package terminal;

import java.util.Scanner;

public class InputAnimal {

    public static Integer numberMenu(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        while (num == - 1 && num > max){
            try {
                num = Integer.parseInt(scanner.next());
                if(num > max) {
                    System.out.println("Значение больше " + max);
                    num = -1;
                }else if (num < min) {
                    System.out.println("Значение меньше " + min);
                    num = -1;
                }
            }catch (Exception e) {
                parsingExceptionMessage();
                num = -1;
            }
        }

        return num;
    }

    private static void parsingExceptionMessage() {
        System.out.println("Неправильная комманда");
    }
}
