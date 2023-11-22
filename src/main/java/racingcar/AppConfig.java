package racingcar;

import racingcar.controller.GameController;
import racingcar.domain.car.strategy.ForwardStrategy;
import racingcar.domain.car.strategy.RandomForwardStrategy;
import racingcar.service.GameService;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.reader.DefaultReader;
import racingcar.view.reader.Reader;

public class AppConfig {

    private static final AppConfig APP_CONFIG = new AppConfig();

    public final GameController gameController;
    public final GameService gameService;
    public final ForwardStrategy forwardStrategy;
    public final InputView inputView;
    public final OutputView outputView;
    public final Reader reader;

    private AppConfig() {
        this.reader = initReader();
        this.outputView = initOutputView();
        this.inputView = initInputView(reader);
        this.forwardStrategy = initForwardStrategy();
        this.gameService = initGameService(forwardStrategy);
        this.gameController = initController(gameService, inputView, outputView);
    }

    public static AppConfig getInstance() {
        return APP_CONFIG;
    }

    private Reader initReader() {
        return new DefaultReader();
    }

    private OutputView initOutputView() {
        return new OutputView();
    }

    private InputView initInputView(final Reader reader) {
        return new InputView(reader);
    }

    private ForwardStrategy initForwardStrategy() {
        return new RandomForwardStrategy();
    }

    private GameService initGameService(final ForwardStrategy forwardStrategy) {
        return new GameService(forwardStrategy);
    }

    private GameController initController(final GameService gameService,
                                          final InputView inputView,
                                          final OutputView outputView) {
        return new GameController(gameService, inputView, outputView);
    }
}
