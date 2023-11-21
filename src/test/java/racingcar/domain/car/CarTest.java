package racingcar.domain.car;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import racingcar.constant.exception.CustomIllegalArgumentException;
import racingcar.constant.exception.car.CarNameExceptionStatus;

class CarTest {

    private static final String PROVIDER_PATH = "racingcar.domain.car.provider.CarProvider#";

    private void exceptionTest(final String carName, final String message) {
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(CustomIllegalArgumentException.class)
                .hasMessageContaining(message);
    }

    @DisplayName("자동차 이름은 NULL이 될 수 없다")
    @ParameterizedTest
    @NullSource
    void carNameNullExceptionTest(final String carName) {
        final String message = CarNameExceptionStatus.CAR_NAME_IS_NULL.getMessage();
        exceptionTest(carName, message);
    }

    @DisplayName("자동차 이름은 공백이 될 수 없다")
    @ParameterizedTest
    @EmptySource
    void carNameBlankExceptionTest(final String carName) {
        final String message = CarNameExceptionStatus.CAR_NAME_IS_BLANK.getMessage();
        exceptionTest(carName, message);
    }

    @DisplayName("자동차 이름은 다섯자를 초과할 수 없다")
    @ParameterizedTest
    @MethodSource(PROVIDER_PATH + "provideForExceededLengthExceptionTest")
    void carNameDuplicatedExceptionTest(final String carName) {
        final String message = CarNameExceptionStatus.CAR_NAME_IS_EXCEEDED_LENGTH.getMessage();
        exceptionTest(carName, message);
    }
}
