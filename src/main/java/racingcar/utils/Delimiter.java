package racingcar.utils;

public enum Delimiter {

    COMMA(","),
    SPACE(" ");

    private final String unit;

    Delimiter(final String unit) {
        this.unit = unit;
    }

    public static String[] splitWithComma(final String target) {
        return target.split(COMMA.unit);
    }

    public static String appendSpace(final String target) {
        return target + SPACE.unit;
    }
}
