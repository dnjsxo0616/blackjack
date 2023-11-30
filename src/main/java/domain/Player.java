package domain;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final List<Integer> playerCardBox;
    private int playerNumber;

    public Player() {
        this.playerCardBox = new ArrayList<>();
    }

    public void playPlayer() {
        selectPlayerCard();
        savePlayerCard();
    }

    private void selectPlayerCard() {
        playerNumber = SelectCard.selectCard();
    }

    private void savePlayerCard() {
        playerCardBox.add(playerNumber);
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public List<Integer> getPlayerCardBox() {
        return playerCardBox;
    }
}
