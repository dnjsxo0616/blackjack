package domain;

public class PlayGame {

    private int winsCount;
    private int defeatCount;
    private int drawsCount;

    public PlayGame() {
        this.winsCount = 0;
        this.defeatCount = 0;
        this.drawsCount = 0;
    }

    public void updateResult(int playerNumber, int dealerNumber) {
        if (playerNumber > dealerNumber) {
            winsCount++;
        }

        if (playerNumber < dealerNumber) {
            defeatCount++;
        }

        drawsCount++;
    }

    public int getWinsCount() {
        return winsCount;
    }

    public int getDefeatCount() {
        return defeatCount;
    }

    public int getDrawsCount() {
        return drawsCount;
    }
}
