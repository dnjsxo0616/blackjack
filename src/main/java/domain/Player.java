package domain;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Integer> playerCardBox;
    private int playerNumber;

    public Player() {
        this.playerCardBox = new ArrayList<>();
    }

    private void selectPlayerCard() {
        playerNumber = SelectCard.selectCard();
    }
}
