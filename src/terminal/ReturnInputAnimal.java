package terminal;

import java.util.Scanner;

public class ReturnInputAnimal {
    public static Integer returnInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.next());
    }
}
