package animals;

import java.util.Comparator;

public class SnakeComparator implements Comparator<Snake> {


    @Override
    public int compare(Snake snake1, Snake snake2) {
        if (snake1.getBodyLength() > snake2.getBodyLength()) {
            return 1;
        } else if (snake1.getBodyLength() < snake2.getBodyLength()) {
            return -1;
        }
        return 0;
    }
}
