package racingcar.domain.round;

import racingcar.domain.round.validator.RoundValidator;

public class Round {

    private final int round;

    public Round(final int round) {
        RoundValidator.validateRound(round);
        this.round = round;
    }
}
