package racingcar.domain.car;

import racingcar.domain.car.strategy.ForwardStrategy;
import racingcar.domain.car.validator.CarValidator;

public class Car {

    private final String carName;
    private int position;

    public Car(final String carName) {
        CarValidator.validateCarName(carName);
        this.carName = carName;
    }

    public void moveForward(final ForwardStrategy forwardStrategy) {
        if (forwardStrategy.isMovable()) {
            this.position++;
        }
    }

    public String getCarName() {
        return this.carName;
    }

    public int getPosition() {
        return this.position;
    }
}
