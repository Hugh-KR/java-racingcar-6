package racingcar.domain.round;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.constant.exception.CustomIllegalArgumentException;
import racingcar.constant.exception.round.RoundExceptionStatus;

class RoundTest {

    private void exceptionTest(final int round, final String message) {
        assertThatThrownBy(() -> new Round(round))
                .isInstanceOf(CustomIllegalArgumentException.class)
                .hasMessageContaining(message);
    }

    @DisplayName("이동 횟수는 양의 정수만 입력될 수 있다")
    @ParameterizedTest
    @ValueSource(ints = {-1, -2, 0, -10, -300})
    void carNameDuplicatedExceptionTest(final int round) {
        final String message = RoundExceptionStatus.ROUND_IS_NEGATIVE.getMessage();
        exceptionTest(round, message);
    }
}
