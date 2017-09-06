package fr.romannumbers;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanConverterTest {
  @Test
  public void should_convert_arabic_1_to_roman_I() throws Exception {
    RomanConverter converter = new RomanConverter();
    assertThat(converter.convertFromArabicToRoman(1)).isEqualTo("I");
  }
}
