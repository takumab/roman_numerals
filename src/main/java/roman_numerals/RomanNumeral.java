package roman_numerals;

public class RomanNumeral {

    public String convert(int number) {
        String roman = "";

        if (number >= 10) {
            roman += "X";
            number -= 10;
        }

        if (number >= 5) {
            roman += "V";
            number -= 5;
        }

        for (int i = 0; i < number; i++) {
            roman += "I";
        }

        return roman;
    }

}
