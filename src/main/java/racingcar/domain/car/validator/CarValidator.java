package racingcar.domain.car.validator;

import java.util.Collections;
import java.util.List;
import racingcar.constant.exception.CustomIllegalArgumentException;
import racingcar.constant.exception.car.CarNameExceptionStatus;

public class CarValidator {

    private static final int ALLOWED_MAXIMUM_LENGTH = 5;

    private static final CarValidator CAR_VALIDATOR = new CarValidator();

    private CarValidator() {
    }

    public static void validateCarName(final String carName) {
        CAR_VALIDATOR.carNameIsExceededLength(carName);
    }

    private void carNameIsExceededLength(final String carName) {
        if (isExceededLength(carName)) {
            throw new CustomIllegalArgumentException(CarNameExceptionStatus.CAR_NAME_IS_EXCEEDED_LENGTH);
        }
    }

    private boolean isExceededLength(final String carName) {
        return ALLOWED_MAXIMUM_LENGTH < carName.length();
    }
}
