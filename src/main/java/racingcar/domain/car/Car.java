package racingcar.domain.car;

import racingcar.domain.car.strategy.ForwardStrategy;
import racingcar.domain.car.validator.CarValidator;

public class Car {

    private final String name;
    private int position;

    public Car(final String name) {
        CarValidator.validateName(name);
        this.name = name;
    }

    public void moveForward(final ForwardStrategy forwardStrategy) {
        if (forwardStrategy.isMovable()) {
            this.position++;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
