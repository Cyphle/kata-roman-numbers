package fr.romannumbers;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanConverterTest {

  private RomanConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new RomanConverter();
  }

  @Test
  public void should_convert_arabic_1_to_roman_I() throws Exception {
    assertThat(converter.convertFromArabicToRoman(1)).isEqualTo("I");
  }

  @Test
  public void should_convert_arabic_2_to_roman_II() throws Exception {
    assertThat(converter.convertFromArabicToRoman(2)).isEqualTo("II");
  }
}
