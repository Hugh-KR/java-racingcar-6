package racingcar.domain.car.validator;

import racingcar.exception.CustomIllegalArgumentException;
import racingcar.exception.car.CarNameExceptionStatus;

public class CarValidator {

    private static final CarValidator CAR_VALIDATOR = new CarValidator();

    private CarValidator() {
    }

    public static void validateName(final String name) {
        CAR_VALIDATOR.validateNameIsNull(name);
        CAR_VALIDATOR.validateNameIsEmpty(name);
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
            throw new CustomIllegalArgumentException(CarNameExceptionStatus.CAR_NAME_IS_NULL);
        }
    }

    private boolean isEmpty(final String name) {
        return name.isEmpty();
    }
}
