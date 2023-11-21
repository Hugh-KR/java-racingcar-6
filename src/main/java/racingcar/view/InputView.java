package racingcar.view;

import java.util.Arrays;
import java.util.List;
import racingcar.utils.Delimiter;
import racingcar.view.reader.Reader;

public class InputView {

    private static final String PRINT_READ_CAR_NAMES_MESSAGE =
            "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";


    private final Reader reader;

    public InputView(final Reader reader) {
        this.reader = reader;
    }

    public List<String> readCarNames() {
        System.out.println(PRINT_READ_CAR_NAMES_MESSAGE);
        return parseCarNames(reader.readLine());
    }

    private List<String> parseCarNames(final String carNames) {
        return Arrays.stream(Delimiter.splitWithComma(carNames))
                .map(String::trim)
                .toList();
    }


}
