package racingcar.controller;

import java.util.List;
import racingcar.service.GameService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {

    private final GameService gameService;
    private final InputView inputView;
    private final OutputView outputView;

    public GameController(final GameService gameService,
                          final InputView inputView,
                          final OutputView outputView) {
        this.gameService = gameService;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void initGame() {
        initCarNames();
        initRound();
    }

    private void initCarNames() {
        final List<String> carNames = inputView.readCarName();
        gameService.initCarNames(carNames);
    }

    private void initRound() {
        final int round = inputView.readRound();
        gameService.initRound(round);
    }

    public void playGame() {
        announceStatusTitle();
        announcePlayStatus();
        announceWinners();
    }

    private void announceStatusTitle() {
        outputView.printStatusTitle();
    }

    private void announcePlayStatus() {
        while (gameService.isContinuable()) {
            gameService.playRound();
            outputView.printCarStatus(gameService.getCurrentStatus());
        }
    }

    private void announceWinners() {
        final List<String> winnerNames = gameService.getWinnerNames();
        outputView.printWinners(winnerNames);
    }
}
