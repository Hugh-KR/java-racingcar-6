package racingcar.utils;

public enum Delimiter {

    COMMA(","),
    COLON(":"),
    SPACE(" "),
    BAR("-");

    private final String unit;

    Delimiter(final String unit) {
        this.unit = unit;
    }

    public static String[] splitWithComma(final String targetString) {
        return targetString.split(COMMA.unit);
    }
}
