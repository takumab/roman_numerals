package roman_numerals;

public enum RomanToNumber {
    TEN("X", 10),
    NINE("IX", 9),
    FIVE("V", 5),
    FOUR("IV", 4),
    ONE("I", 1);

    public final String roman;
    public final int number;

    RomanToNumber(String roman, int number) {
        this.roman = roman;
        this.number = number;
    }
}
