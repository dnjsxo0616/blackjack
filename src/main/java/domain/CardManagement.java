package domain;

import java.util.ArrayList;
import java.util.List;

public class CardManagement {
    private final List<Integer> playerCardBox;
    private int playerNumber;
    private final List<Integer> dealerCardBox;
    private int dealerNumber;

    public CardManagement() {
        this.playerCardBox = new ArrayList<>();
        this.dealerCardBox = new ArrayList<>();
    }

    public void startManagement() {
        selectCard();
        saveCard(playerCardBox, playerNumber);
        saveCard(dealerCardBox, dealerNumber);
    }

    private void selectCard() {
        playerNumber = SelectCard.selectCard();
        dealerNumber = SelectCard.selectCard();
    }

    private void saveCard(List<Integer> cardBox, int number) {
        cardBox.add(number);
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public List<Integer> getPlayerCardBox() {
        return playerCardBox;
    }

    public int getDealerNumber() {
        return dealerNumber;
    }

    public List<Integer> getDealerCardBox() {
        return dealerCardBox;
    }

    public String ResultMessage() {
        if(playerNumber > dealerNumber) {
            return "당신이 이겼습니다.";
        } else if(playerNumber < dealerNumber) {
            return "딜러가 이겼습니다.";
        } else {
            return "비겼습니다.";
        }
    }
}
