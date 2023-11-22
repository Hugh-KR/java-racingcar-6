package racingcar.domain.car.validator;

import java.util.Collections;
import java.util.List;
import racingcar.exception.CustomIllegalArgumentException;
import racingcar.exception.car.CarNameExceptionStatus;

public class CarsValidator {

    private static final CarsValidator CARS_VALIDATOR = new CarsValidator();
    private static final int ALLOWED_MAXIMUM_COUNT = 1;

    private CarsValidator() {
    }

    public static void validateCarNames(final List<String> carNames) {
        CARS_VALIDATOR.validateCarNamesIsDuplicated(carNames);
    }

    private void validateCarNamesIsDuplicated(final List<String> carNames) {
        if (checkCarNamesIsDuplicated(carNames)) {
            throw new CustomIllegalArgumentException(CarNameExceptionStatus.CAR_NAME_IS_DUPLICATED);
        }
    }

    private boolean checkCarNamesIsDuplicated(final List<String> carNames) {
        return carNames.stream()
                .anyMatch(carName -> isDuplicated(carNames, carName));
    }

    private boolean isDuplicated(final List<String> carNames, final String carName) {
        return Collections.frequency(carNames, carName) > ALLOWED_MAXIMUM_COUNT;
    }
}
