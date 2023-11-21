package racingcar.service;

import java.util.List;
import racingcar.domain.car.Cars;

public class GameService {

    private Cars cars;

    public void initCarNames(final List<String> corNames) {
        this.cars = new Cars(corNames);
    }
}

