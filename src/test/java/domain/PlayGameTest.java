package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayGameTest {
    private PlayGame playGame;

    @BeforeEach
    public void setUp() {
        playGame = new PlayGame();
    }

    @Test
    @DisplayName("플레이어_승리_결과_스코어_테스트")
    void playerWin() {
        playGame.updateResult(9, 8);

        assertEquals(1, playGame.getWinsCount());
        assertEquals(0, playGame.getDefeatCount());
        assertEquals(0, playGame.getDrawsCount());
    }

    @Test
    @DisplayName("딜러_승리_결과_스코어_테스트")
    void dealerWin() {
        playGame.updateResult(7, 8);

        assertEquals(0, playGame.getWinsCount());
        assertEquals(1, playGame.getDefeatCount());
        assertEquals(0, playGame.getDrawsCount());
    }

    @Test
    @DisplayName("무승부_결과_스코어_테스트")
    void draw() {
        playGame.updateResult(8, 8);

        assertEquals(0, playGame.getWinsCount());
        assertEquals(0, playGame.getDefeatCount());
        assertEquals(1, playGame.getDrawsCount());
    }

    @Test
    @DisplayName("결과_누적_테스트")
    void totalResult() {
        playGame.updateResult(9, 8);
        assertEquals(1, playGame.getWinsCount());
        assertEquals(0, playGame.getDefeatCount());
        assertEquals(0, playGame.getDrawsCount());

        playGame.updateResult(7, 8);
        assertEquals(1, playGame.getWinsCount());
        assertEquals(1, playGame.getDefeatCount());
        assertEquals(0, playGame.getDrawsCount());

        playGame.updateResult(8, 8);
        assertEquals(1, playGame.getWinsCount());
        assertEquals(1, playGame.getDefeatCount());
        assertEquals(1, playGame.getDrawsCount());
    }

}