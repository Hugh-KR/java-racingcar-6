package racingcar.domain.car;

import racingcar.domain.car.validator.CarValidator;

public class Car {

    private final String carName;

    public Car(final String carName) {
        CarValidator.validateCarName(carName);
        this.carName = carName;
    }
}
