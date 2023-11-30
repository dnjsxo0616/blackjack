package domain;

public class ValidateInput {
    private static final String RESTART_COMMAND = "y";
    private static final String STOP_COMMAND = "n";
    public static String validateInput(String input) {
        String command = input.toLowerCase();

        if(!command.equals(RESTART_COMMAND) && !command.equals(STOP_COMMAND)) {
            throw new IllegalArgumentException("잘못 입력하셨습니다.");
        }

        return command;
    }
}
