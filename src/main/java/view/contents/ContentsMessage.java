package view.contents;

public enum ContentsMessage {
    GAME_COUNT_MESSAGE("Game %d"),
    GAME_RESULT_MESSAGE("현재 전적: %d승 %d패 %d무"),
    GAME_RESTART_MESSAGE("한 게임 더 하시겠습니까? (Y / N)");

    private final String message;

    ContentsMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getFormatMessage(int number) {
        return String.format(message, number);
    }

    public String getFormatMessage(int win, int defeat, int draw) {
        return String.format(message, win, defeat, draw);
    }
}
