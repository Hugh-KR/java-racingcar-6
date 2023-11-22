package racingcar.domain.round;

import racingcar.domain.round.validator.RoundValidator;

public class Round {

    private static final int GAME_FINISHED_CONDITION = 0;

    private int count;

    public Round(final int count) {
        RoundValidator.validateCount(count);
        this.count = count;
    }

    public boolean isNotFinished() {
        return this.count != GAME_FINISHED_CONDITION;
    }

    public void decreaseCount() {
        this.count--;
    }
}
