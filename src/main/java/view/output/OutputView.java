package view.output;

import view.contents.ContentsMessage;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static void print(ContentsMessage contentsMessage) {
        System.out.print(contentsMessage.getMessage());
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void println(ContentsMessage contentsMessage, int number) {
        System.out.println(contentsMessage.getFormatMessage(number));
    }

    public static void println(ContentsMessage contentsMessage, int win, int defeat, int draw) {
        System.out.println(contentsMessage.getFormatMessage(win, defeat, draw));
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static void printCardBox(ContentsMessage contentsMessage, List<Integer> cardBox) {
        String result = cardBox.stream()
                .map(number -> "["+number+"]")
                .collect(Collectors.joining());
        System.out.println(contentsMessage.getMessage() + result);
    }
}