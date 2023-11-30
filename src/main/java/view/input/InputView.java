package view.input;

import view.contents.ContentsMessage;
import view.output.OutputView;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readInput() {
        OutputView.print(ContentsMessage.GAME_RESTART_MESSAGE);
        return scanner.next();
    }
}
