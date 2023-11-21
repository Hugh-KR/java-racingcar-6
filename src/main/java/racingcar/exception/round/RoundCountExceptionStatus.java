package racingcar.exception.round;

import racingcar.exception.ExceptionStatus;

public enum RoundCountExceptionStatus implements ExceptionStatus {

    ROUND_IS_NOT_NUMERIC("숫자만 입력 가능합니다."),
    ROUND_IS_NOT_POSITIVE("양의 정수만 입력 가능합니다.");

    private static final String ERROR_PREFIX = "[ERROR] ";
    private static final String MESSAGE_PREFIX = "이동 횟수는 ";
    private static final String MESSAGE_SUFFIX = " 게임을 종료합니다.";
    private final String message;

    RoundCountExceptionStatus(final String message) {
        this.message = ERROR_PREFIX + MESSAGE_PREFIX + message + MESSAGE_SUFFIX;
    }

    public String getMessage() {
        return this.message;
    }
}
