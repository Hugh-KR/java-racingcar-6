package racingcar.domain.car.strategy;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomForwardStrategy implements ForwardStrategy {

    private static final int START_RANDOM_NUMBER = 0;
    private static final int END_RANDOM_NUMBER = 9;
    private static final int STATE_TO_MOVE = 4;

    @Override
    public boolean isMovable() {
        return STATE_TO_MOVE <= generateRandomNumber();
    }

    private int generateRandomNumber() {
        return Randoms.pickNumberInRange(START_RANDOM_NUMBER, END_RANDOM_NUMBER);
    }
}
