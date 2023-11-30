package domain;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private final List<Integer> dealerCardBox;
    private int dealerNumber;

    public Dealer() {
        this.dealerCardBox = new ArrayList<>();
    }

    public void playDealer() {
        selectDealerCard();
        saveDealerCard();
    }

    private void selectDealerCard() {
        dealerNumber = SelectCard.selectCard();
    }

    private void saveDealerCard() {
        dealerCardBox.add(dealerNumber);
    }

    public int getDealerNumber() {
        return dealerNumber;
    }

    public List<Integer> getDealerCardBox() {
        return dealerCardBox;
    }
}
