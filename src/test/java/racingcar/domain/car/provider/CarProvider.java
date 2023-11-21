package racingcar.domain.car.provider;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class CarProvider {

    public static Stream<Arguments> provideForExceededLengthExceptionTest() {
        return Stream.of(
                Arguments.of("po bier"),
                Arguments.of("pobidd "),
                Arguments.of(" ju nlmll l00")
        );
    }
}
