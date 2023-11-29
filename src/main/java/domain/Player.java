package domain;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Integer> playerCardBox;
    private int playerNumber;

    public void playPlayer(){
        selectPlayerCard();
        savePlayerCard();
    }

    public Player() {
        this.playerCardBox = new ArrayList<>();
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
