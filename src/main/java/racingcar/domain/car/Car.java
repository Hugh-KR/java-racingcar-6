package racingcar.domain.car;

import racingcar.domain.car.validator.CarValidator;

public class Car {

    private final String name;

    public Car(final String name) {
        CarValidator.validateName(name);
        this.name = name;
    }
}
