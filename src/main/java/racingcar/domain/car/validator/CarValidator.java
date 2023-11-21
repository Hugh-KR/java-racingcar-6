package racingcar.domain.car.validator;

import racingcar.exception.CustomIllegalArgumentException;
import racingcar.exception.car.CarNameExceptionStatus;

public class CarValidator {

    private static final CarValidator CAR_VALIDATOR = new CarValidator();
    private static final int ALLOWED_MAXIMUM_LENGTH = 5;

    private CarValidator() {
    }

    public static void validateName(final String name) {
        CAR_VALIDATOR.validateNameIsNull(name);
        CAR_VALIDATOR.validateNameIsEmpty(name);
        CAR_VALIDATOR.validateNameIsTooLong(name);
    }

    private void validateNameIsNull(final String name) {
        if (isNull(name)) {
            throw new CustomIllegalArgumentException(CarNameExceptionStatus.CAR_NAME_IS_NULL);
        }
    }

    private boolean isNull(final String name) {
        return name == null;
    }

    private void validateNameIsEmpty(final String name) {
        if (isEmpty(name)) {
            throw new CustomIllegalArgumentException(CarNameExceptionStatus.CAR_NAME_IS_EMPTY);
        }
    }

    private boolean isEmpty(final String name) {
        return name.isEmpty();
    }

    private void validateNameIsTooLong(final String name) {
        if (isTooLong(name)) {
            throw new CustomIllegalArgumentException(CarNameExceptionStatus.CAR_NAME_IS_TOO_LONG);
        }
    }

    private boolean isTooLong(final String name) {
        return ALLOWED_MAXIMUM_LENGTH < name.length();
    }
}
