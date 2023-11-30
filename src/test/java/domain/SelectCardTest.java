package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectCardTest {

    @Test
    @DisplayName("무작위_숫자_범위_테스트")
    void selectCard() {
        int randomNumber = SelectCard.selectCard();

        assertTrue(randomNumber >= 1 && randomNumber <= 11);
    }
}