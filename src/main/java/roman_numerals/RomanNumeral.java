package roman_numerals;

public class RomanNumeral {
    public String convert(int number) {
        String convertedToRoman = "";
        if (number == 10) {
            convertedToRoman += "X";
            number -= 10;
        }

        if (number >= 5) {
            convertedToRoman += "V";
            number -= 5;
        }
        for (int i = 0; i < number; i++) {
            convertedToRoman += "I";
        }
        return convertedToRoman;
    }
}
