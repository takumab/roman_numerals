package roman_numerals;

//    Write a function to convert Arabic numbers to Roman numerals as best as you can,
//    following the TDD practices we have been using.⁴³
//    Given a positive integer number (for example, 42),
//    determine its Roman numeral representation as a string (for example, “XLII”).
//    You cannot write numerals like IM for 999.

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @ParameterizedTest
    @CsvSource({
            "I,       1",
            "II,      2",
            "III,     3"
    })
    void convert_number_to_roman_numeral(String expected, int input) {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals(expected, romanNumeral.convert(input));
    }
}
