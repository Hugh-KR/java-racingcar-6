package racingcar.domain.car;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import racingcar.constant.exception.CustomIllegalArgumentException;
import racingcar.constant.exception.car.CarNameExceptionStatus;

class CarsTest {

    private static final String PROVIDER_PATH = "racingcar.domain.car.provider.CarsProvider#";

    @DisplayName("자동차 이름은 중복될 수 없다")
    @ParameterizedTest
    @MethodSource(PROVIDER_PATH + "provideForDuplicateExceptionTest")
    void carNameDuplicatedExceptionTest(final List<String> carNames) {
        assertThatThrownBy(() -> new Cars(carNames))
                .isInstanceOf(CustomIllegalArgumentException.class)
                .hasMessageContaining(CarNameExceptionStatus.CAR_NAME_IS_DUPLICATED.getMessage());
    }
}
