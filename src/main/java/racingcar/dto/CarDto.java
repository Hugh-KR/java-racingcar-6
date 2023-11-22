package racingcar.dto;

import racingcar.domain.car.Car;
import racingcar.utils.Delimiter;

public record CarDto(String name, int position) {

    public static CarDto toDto(final Car car) {
        return new CarDto(car.getName(), car.getPosition());
    }

    @Override
    public String toString() {
        return Delimiter.concatWithColon(name, Delimiter.repeatUnderBar(position));
    }
}
