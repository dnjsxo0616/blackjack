package controller;

import domain.Dealer;
import domain.PlayGame;
import domain.Player;
import domain.ValidateInput;
import view.contents.ContentsMessage;
import view.input.InputView;
import view.output.OutputView;

import java.util.Locale;

public class GameController {

    private static final String STOP_COMMAND = "n";

    private int roundCount = 0;

    public void GamePlay() {
        Player player = new Player();
        Dealer dealer = new Dealer();
        PlayGame playGame = new PlayGame();

        OutputView.print(ContentsMessage.GAME_START_MESSAGE);
        OutputView.printNewLine();

        boolean gameContinue = true;
        while (gameContinue) {
            roundCount++;
            OutputView.println(ContentsMessage.GAME_COUNT_MESSAGE, roundCount);

            player.playPlayer();
            dealer.playDealer();

            playGame.updateResult(player.getPlayerNumber(), dealer.getDealerNumber());

            OutputView.printCardBox(ContentsMessage.PLAYER_CARD_BOX, player.getPlayerCardBox());
            OutputView.printCardBox(ContentsMessage.DEALER_CARD_BOX, dealer.getDealerCardBox());


            if (player.getPlayerNumber() > dealer.getDealerNumber()) {
                OutputView.print(ContentsMessage.WIN_MESSAGE);
                OutputView.printNewLine();
            }

            if (player.getPlayerNumber() < dealer.getDealerNumber()) {
                OutputView.print(ContentsMessage.DEFEAT_MESSAGE);
                OutputView.printNewLine();
            }

            OutputView.print(ContentsMessage.DRAW_MESSAGE);
            OutputView.println(ContentsMessage.GAME_RESULT_MESSAGE, playGame.getWinsCount(), playGame.getDefeatCount(), playGame.getDrawsCount());

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
