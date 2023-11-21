package racingcar.domain.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public Cars(final List<String> carNames) {
        carNames.forEach(carName -> cars.add(new Car(carName)));
    }
}
