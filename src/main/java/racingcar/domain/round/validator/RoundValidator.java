package racingcar.domain.round.validator;

import racingcar.exception.CustomIllegalArgumentException;
import racingcar.exception.round.RoundCountExceptionStatus;

public class RoundValidator {

    private static final RoundValidator ROUND_VALIDATOR = new RoundValidator();
    private static final int ALLOWED_MINIMUM_ROUND = 0;

    private RoundValidator() {
    }

    public static void validateCount(final int count) {
        ROUND_VALIDATOR.validateCountIsTooSmall(count);
    }

    private void validateCountIsTooSmall(final int count) {
        if(isTooSmall(count)) {
            throw new CustomIllegalArgumentException(RoundCountExceptionStatus.ROUND_IS_NOT_POSITIVE);
        }
    }

    private boolean isTooSmall(final int count) {
        return count <= ALLOWED_MINIMUM_ROUND;
    }
}
