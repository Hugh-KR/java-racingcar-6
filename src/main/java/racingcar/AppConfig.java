package racingcar;

import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.reader.DefaultReader;
import racingcar.view.reader.Reader;

public class AppConfig {


    public final Reader reader;
    public final InputView inputView;

    private AppConfig() {
        this.reader = initReader();
        this.inputView = initInputView(reader);
    }

    private DefaultReader initReader() {
        return new DefaultReader();
    }

    private InputView initInputView(Reader reader) {
        return new InputView(reader);
    }
}
