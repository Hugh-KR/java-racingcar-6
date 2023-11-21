package racingcar.constant.exception.round;

import racingcar.constant.exception.ExceptionStatus;

public enum RoundExceptionStatus implements ExceptionStatus {

    ROUND_IS_NOT_NUMERIC("숫자가 아닌 값이 될 수 없습니다."),
    ROUND_IS_NEGATIVE("양의 정수만 입력 가능합니다.");

    private static final String MESSAGE_PREFIX = "[ERROR] 이동 횟수는 ";
    private static final String MESSAGE_SUFFIX = " 게임을 종료합니다.";

    private final String message;

    RoundExceptionStatus(final String message) {
        this.message = MESSAGE_PREFIX + message + MESSAGE_SUFFIX;
    }

    public String getMessage() {
        return this.message;
    }
}
