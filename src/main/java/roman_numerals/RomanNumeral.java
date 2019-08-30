package roman_numerals;

public class RomanNumeral {
    public String convert(int number) {
        String convertedToRoman = "";
        for (int i = 0; i < number; i++) {
            convertedToRoman += "I";
        }
        return convertedToRoman;
    }
}
