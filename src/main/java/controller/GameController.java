package controller;

import domain.*;
import view.contents.ContentsMessage;
import view.input.InputView;
import view.output.OutputView;

import java.util.Locale;

public class GameController {

    private static final String STOP_COMMAND = "n";

    private int roundCount = 0;

    public void GamePlay() {
        CardManagement cardManagement = new CardManagement();
        PlayGame playGame = new PlayGame();

        OutputView.print(ContentsMessage.GAME_START_MESSAGE);
        OutputView.printNewLine();

        boolean gameContinue = true;
        while (gameContinue) {
            roundCount++;
            OutputView.println(ContentsMessage.GAME_COUNT_MESSAGE, roundCount);

            cardManagement.startManagement();

            playGame.updateResult(cardManagement.getPlayerNumber(), cardManagement.getDealerNumber());

            OutputView.printCardBox(ContentsMessage.PLAYER_CARD_BOX, cardManagement.getPlayerCardBox());
            OutputView.printCardBox(ContentsMessage.DEALER_CARD_BOX, cardManagement.getDealerCardBox());

            OutputView.println(cardManagement.ResultMessage());

            OutputView.println(ContentsMessage.GAME_RESULT_MESSAGE, playGame.getWinsCount(), playGame.getDefeatCount(), playGame.getDrawsCount());
            OutputView.printNewLine();

            gameContinue = gameRound();
        }

        OutputView.print(ContentsMessage.GAME_STOP_MESSAGE);
        OutputView.printNewLine();
        OutputView.print(ContentsMessage.GAME_LAST_MESSAGE);
    }

    private static boolean gameRound() {
        OutputView.print(ContentsMessage.GAME_RESTART_MESSAGE);
        boolean gameContinue = true;
        try {
            String input = InputView.readInput();
            if (ValidateInput.validateInput(input).equals(STOP_COMMAND)) {
                gameContinue = false;
            }
        } catch (IllegalArgumentException e) {
            OutputView.println(e.getMessage());
        }

        return gameContinue;
    }

}
