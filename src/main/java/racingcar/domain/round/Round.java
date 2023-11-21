package racingcar.domain.round;

import racingcar.domain.round.validator.RoundValidator;

public class Round {

    private int count;

    public Round(final int count) {
        RoundValidator.validateCount(count);
        this.count = count;
    }


    public int getCount() {
        return this.count;
    }
}
