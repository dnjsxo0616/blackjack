package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {

    @Test
    @DisplayName("대소문자_입력_테스트")
    void validateInput() {
        String input1 = "y";
        String input2 = "n";

        assertEquals("y", ValidateInput.validateInput(input1));
        assertEquals("n", ValidateInput.validateInput(input2));

        assertEquals("y", ValidateInput.validateInput(input1.toUpperCase()));
        assertEquals("n", ValidateInput.validateInput(input2.toUpperCase()));
    }
}