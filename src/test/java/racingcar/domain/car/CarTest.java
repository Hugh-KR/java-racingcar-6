package racingcar.domain.car;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import racingcar.constant.exception.CustomIllegalArgumentException;
import racingcar.constant.exception.car.CarNameExceptionStatus;

class CarTest {

    private static final String PROVIDER_PATH = "racingcar.domain.car.provider.CarProvider#";

    @DisplayName("자동차 이름은 다섯자를 초과할 수 없다")
    @ParameterizedTest
    @MethodSource(PROVIDER_PATH + "provideForExceededLengthExceptionTest")
    void carNameDuplicatedExceptionTest(final String carName) {
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(CustomIllegalArgumentException.class)
                .hasMessageContaining(CarNameExceptionStatus.CAR_NAME_IS_EXCEEDED_LENGTH.getMessage());
    }
}
