package racingcar.domain.car.provider;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class CarsProvider {

    public static Stream<Arguments> provideForDuplicateExceptionTest() {
        return Stream.of(
                Arguments.of(Arrays.asList("pobi","pobi","jun")),
                Arguments.of(Arrays.asList("jun","pobi","jun","woni"))
        );
    }
}
