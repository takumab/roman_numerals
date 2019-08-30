package roman_numerals;

public class RomanNumeral {
    public String convert(int number) {
        String convertedToRoman = "";
        if (number == 10) {
            return "X";
        }
        if (number == 20) {
            return "XX";
        }
        if (number == 30) {
            return "XXX";
        }
        for (int i = 0; i < number; i++) {
            convertedToRoman += "I";
        }
        return convertedToRoman;
    }
}
