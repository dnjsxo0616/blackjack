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

}