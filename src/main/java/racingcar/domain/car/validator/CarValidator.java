package racingcar.domain.car.validator;

import racingcar.constant.exception.CustomIllegalArgumentException;
import racingcar.constant.exception.car.CarNameExceptionStatus;

public class CarValidator {

    private static final int ALLOWED_MAXIMUM_LENGTH = 5;

    private static final CarValidator CAR_VALIDATOR = new CarValidator();

    private CarValidator() {
    }

    public static void validateCarName(final String carName) {
        CAR_VALIDATOR.validateCarNameIsNull(carName);
        CAR_VALIDATOR.validateCarNameIsBlank(carName);
        CAR_VALIDATOR.validateCarNameIsExceededLength(carName);
    }

    private void validateCarNameIsNull(final String carName) {
        if (isNull(carName)) {
            throw new CustomIllegalArgumentException(CarNameExceptionStatus.CAR_NAME_IS_NULL);
        }
    }

    private boolean isNull(final String carName) {
        return carName == null;
    }

    private void validateCarNameIsBlank(final String carName) {
        if (isBlank(carName)) {
            throw new CustomIllegalArgumentException(CarNameExceptionStatus.CAR_NAME_IS_BLANK);
        }
    }

    private boolean isBlank(final String carName) {
        return carName.isEmpty() || carName.isBlank();
    }


    private void validateCarNameIsExceededLength(final String carName) {
        if (isExceededLength(carName)) {
            throw new CustomIllegalArgumentException(CarNameExceptionStatus.CAR_NAME_IS_EXCEEDED_LENGTH);
        }
    }

    private boolean isExceededLength(final String carName) {
        return ALLOWED_MAXIMUM_LENGTH < carName.length();
    }
}
