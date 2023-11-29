package domain;

import java.util.Random;

public class SelectCard {
    public static int selectCard() {
        Random random = new Random();
        return random.nextInt(11) + 1;
    }
}
