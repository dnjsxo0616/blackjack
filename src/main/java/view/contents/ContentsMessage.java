package view.contents;

public enum ContentsMessage {
    GAME_START_MESSAGE("간단 카드 게임을 시작합니다."),
    GAME_COUNT_MESSAGE("Game %d"),
    GAME_RESULT_MESSAGE("현재 전적: %d승 %d패 %d무"),
    GAME_RESTART_MESSAGE("한 게임 더 하시겠습니까? (Y / N) "),
    WIN_MESSAGE("당신이 이겼습니다."),
    DEFEAT_MESSAGE("딜러가 이겼습니다."),
    DRAW_MESSAGE("비겼습니다."),
    GAME_STOP_MESSAGE("게임을 종료합니다."),
    GAME_LAST_MESSAGE("플레이해주셔서 감사합니다."),
    PLAYER_CARD_BOX("You   : "),
    DEALER_CARD_BOX("Dealer: ");

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
