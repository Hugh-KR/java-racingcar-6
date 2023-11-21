package racingcar.domain.round.validator;

import racingcar.constant.exception.CustomIllegalArgumentException;
import racingcar.constant.exception.round.RoundExceptionStatus;

public class RoundValidator {

    private static final int ALLOWED_MINIMUM_ROUND = 1;
    private static final RoundValidator ROUND_VALIDATOR = new RoundValidator();

    private RoundValidator() {
    }

    public static void validateRound(final int round) {
        ROUND_VALIDATOR.validateRoundIsNotPositive(round);
    }

    private void validateRoundIsNotPositive(final int round) {
        if (isNotPositive(round)) {
            throw new CustomIllegalArgumentException(RoundExceptionStatus.ROUND_IS_NEGATIVE);
        }
    }

    private boolean isNotPositive(final int round) {
        return round < ALLOWED_MINIMUM_ROUND;
    }
}
