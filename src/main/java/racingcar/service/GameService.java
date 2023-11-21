package racingcar.service;

import java.util.List;
import racingcar.domain.car.Cars;
import racingcar.domain.round.Round;

public class GameService {

    private Cars cars;
    private Round round;

    public void initCarNames(final List<String> corNames) {
        this.cars = new Cars(corNames);
    }

    public void initRound(final int round) {
        this.round = new Round(round);
    }
}

