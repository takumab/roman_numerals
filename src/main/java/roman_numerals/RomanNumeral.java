package roman_numerals;

import org.apache.commons.lang3.NotImplementedException;

public class RomanNumeral {

    public String convert(int number) {
        String roman = "";
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
