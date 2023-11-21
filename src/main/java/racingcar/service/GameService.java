package racingcar.service;

import java.util.List;
import racingcar.domain.car.Cars;
import racingcar.domain.car.strategy.ForwardStrategy;
import racingcar.domain.round.Round;
import racingcar.dto.CarDto;

public class GameService {

    private final ForwardStrategy forwardStrategy;

    private Cars cars;
    private Round round;


    public GameService(final ForwardStrategy forwardStrategy) {
        this.forwardStrategy = forwardStrategy;
    }

    public void initCarNames(final List<String> carNames) {
        this.cars = new Cars(carNames, this.forwardStrategy);
    }

    public void initRound(final int round) {
        this.round = new Round(round);
    }

    public void playRound() {
        cars.moveForwardOrStop();
        round.decreaseCount();
    }

    public boolean isContinuable() {
        return round.isNotFinished();
    }

    public List<CarDto> getCurrentStatus() {
        return cars.getStatus();
    }

    public List<String> getWinnerNames() {
        return cars.getWinnerNames();
    }
}

