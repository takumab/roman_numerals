package roman_numerals;

public enum RomanToNumber {
    TEN("X", 10),
    FIVE("V", 5);

    public final String roman;
    public final int number;

    RomanToNumber(String roman, int number) {
        this.roman = roman;
        this.number = number;
    }
}
