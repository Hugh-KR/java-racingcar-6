package racingcar.domain.car;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.strategy.ForwardStrategy;
import racingcar.domain.car.validator.CarsValidator;
import racingcar.dto.CarDto;

public class Cars {

    private final List<Car> cars = new ArrayList<>();
    private final ForwardStrategy forwardStrategy;

    public Cars(final List<String> carNames, final ForwardStrategy forwardStrategy) {
        carNames.forEach(carName -> cars.add(new Car(carName)));
        CarsValidator.validateCarNames(carNames);
        this.forwardStrategy = forwardStrategy;
    }

    public void moveForwardOrStop() {
        cars.forEach(car -> car.moveForward(forwardStrategy));
    }

    public List<CarDto> getStatus() {
        return cars.stream()
                .map(CarDto::toDto)
                .toList();
    }
}
