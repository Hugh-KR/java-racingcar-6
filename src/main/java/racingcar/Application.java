package racingcar;

import racingcar.controller.GameController;

public class Application {

    private final GameController gameController;

    public Application(final AppConfig appConfig) {
        this.gameController = appConfig.gameController;
    }

    public static void main(String[] args) {
        final AppConfig appConfig = AppConfig.getInstance();
        Application application = new Application(appConfig);
        application.run();
    }

    public void run() {
        gameController.initGame();
        gameController.playGame();
    }
}
