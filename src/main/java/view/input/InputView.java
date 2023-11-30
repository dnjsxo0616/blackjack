package view.input;

import view.contents.ContentsMessage;
import view.output.OutputView;

import java.util.Scanner;

public class InputView {

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        OutputView.print(ContentsMessage.GAME_RESTART_MESSAGE);
        return scanner.nextInt();
    }
}
