package roman_numerals;

public class RomanNumeral {

    public String convert(int number) {
        String roman = "";

        for (RomanToNumber romanToNumber : RomanToNumber.values()) {
            if (number >= romanToNumber.number) {
                roman += romanToNumber.roman;
                number -= romanToNumber.number;
            }
        }

        for (int i = 0; i < number; i++) {
            roman += "I";
        }

        return roman;
    }

}
