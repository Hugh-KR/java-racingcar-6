package racingcar.constant.exception.car;

import racingcar.constant.exception.ExceptionStatus;

public enum CarNameExceptionStatus implements ExceptionStatus {

    CAR_NAME_IS_DUPLICATED("중복될 수 없습니다.");

    private static final String MESSAGE_PREFIX = "[ERROR] 자동차 이름은 ";
    private static final String MESSAGE_SUFFIX = " 게임을 종료합니다.";

    private final String message;

    CarNameExceptionStatus(final String message) {
        this.message = MESSAGE_PREFIX + message + MESSAGE_SUFFIX;
    }

    public String getMessage() {
        return this.message;
    }
}
