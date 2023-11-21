package racingcar.domain.car.strategy;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomForwardStrategy implements ForwardStrategy {

    private static final int RANDOM_NUMBER_START = 0;
    private static final int RANDOM_NUMBER_END = 9;
    private static final int CONDITION_TO_MOVE = 4;

    @Override
    public boolean isMovable() {
        return generateRandomNumber() >= CONDITION_TO_MOVE;
    }

    private int generateRandomNumber() {
        return Randoms.pickNumberInRange(RANDOM_NUMBER_START, RANDOM_NUMBER_END);
    }

}
