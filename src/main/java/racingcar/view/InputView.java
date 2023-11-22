package racingcar.view;

import java.util.Arrays;
import java.util.List;
import racingcar.exception.CustomIllegalArgumentException;
import racingcar.exception.round.RoundCountExceptionStatus;
import racingcar.utils.Delimiter;
import racingcar.view.reader.Reader;

public class InputView {

    private static final String PRINT_READ_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String PRINT_READ_ROUND_MESSAGE = "시도할 횟수는 몇회인가요?";

    private final Reader reader;

    public InputView(final Reader reader) {
        this.reader = reader;
    }

    public List<String> readCarName() {
        System.out.println(PRINT_READ_CAR_NAME_MESSAGE);
        return parseCarNames(reader.readLine());
    }

    private List<String> parseCarNames(final String carNames) {
        return Arrays.stream(Delimiter.splitWithComma(carNames))
                .map(String::trim)
                .toList();
    }

    public int readRound() {
        System.out.println(PRINT_READ_ROUND_MESSAGE);
        return parseRound(reader.readLine());
    }

    private int parseRound(final String round) {
        try {
            return Integer.parseInt(round.trim());
        } catch (NumberFormatException e) {
            throw new CustomIllegalArgumentException(RoundCountExceptionStatus.ROUND_IS_NOT_NUMERIC);
        }
    }
}
