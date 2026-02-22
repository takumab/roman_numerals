package roman_numerals;

public class RomanNumeral {

    public String convert(int number) {
        String roman = "";

        for (RomanToNumber romanToNumber : RomanToNumber.values()) {
            while (number >= romanToNumber.number) {
                roman += romanToNumber.roman;
                number -= romanToNumber.number;
            }
        }

        return roman;
    }

}
