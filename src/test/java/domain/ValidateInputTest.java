package domain;

import org.assertj.core.api.Assertions;
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

    @Test
    @DisplayName("입력_오류_테스트")
    void validateInputFail() {
        String input = "x";

        Assertions.assertThatThrownBy(()-> ValidateInput.validateInput(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못 입력하셨습니다.");
    }
}