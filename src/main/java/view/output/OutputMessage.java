package view.output;

import view.contents.ContentsMessage;

public class OutputMessage {
    public static void println(ContentsMessage contentsMessage) {
        System.out.println(contentsMessage.getMessage());
    }

    public static void println(ContentsMessage contentsMessage, int number) {
        System.out.println(contentsMessage.getFormatMessage(number));
    }

    public static void println(ContentsMessage contentsMessage, int win, int defeat, int draw) {
        System.out.println(contentsMessage.getFormatMessage(win, defeat, draw));
    }
}