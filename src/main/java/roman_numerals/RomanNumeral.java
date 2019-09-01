package roman_numerals;

public class RomanNumeral {

    public String convert(int number) {
        String convertedToRoman = "";
        for (RomanToNumber romanToNumber : RomanToNumber.values()) {
            if (number >= romanToNumber.number) {
                convertedToRoman += romanToNumber.roman;
                number -= romanToNumber.number;
            }
        }
        for (int i = 0; i < number; i++) {
            convertedToRoman += "I";
        }
        return convertedToRoman;
    }

}
