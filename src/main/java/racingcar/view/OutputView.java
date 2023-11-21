package racingcar.view;

import java.util.List;
import racingcar.domain.car.Car;
import racingcar.dto.CarDto;

public class OutputView {

    private static final String PRINT_STATUS_TITLE = "\n실행 결과";
    private static final String PRINT_WINNER_MESSAGE = "최종 우승자 : ";

    public void printStatusTitle() {
        System.out.println(PRINT_STATUS_TITLE);
    }

    public void printCarStatus(final List<CarDto> carStatus) {
        carStatus.stream()
                .map(CarDto::toString)
                .forEach(System.out::println);
        System.out.println();
    }
}
