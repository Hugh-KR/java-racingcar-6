package racingcar.exception.car;

import racingcar.exception.ExceptionStatus;

public enum CarNameExceptionStatus implements ExceptionStatus {

    CAR_NAME_IS_NULL("NULL이 될 수 없습니다."),
    CAR_NAME_IS_DUPLICATED("중복될 수 없습니다.");

    private static final String ERROR_PREFIX = "[ERROR] ";
    private static final String MESSAGE_PREFIX = "자동차의 이름은 ";
    private static final String MESSAGE_SUFFIX = " 게임을 종료합니다.";
    private final String message;

    CarNameExceptionStatus(final String message) {
        this.message = ERROR_PREFIX + MESSAGE_PREFIX + message + MESSAGE_SUFFIX;
    }

    public String getMessage() {
        return this.message;
    }
}
