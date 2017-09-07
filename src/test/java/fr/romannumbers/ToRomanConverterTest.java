package fr.romannumbers;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ToRomanConverterTest {
  private ArabicToRomanConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new ArabicToRomanConverter();
  }

  @Test
  public void should_convert_arabic_1_to_roman_I() throws Exception {
    assertThat(converter.convert(1)).isEqualTo("I");
  }

  @Test
  public void should_convert_arabic_2_to_roman_II() throws Exception {
    assertThat(converter.convert(2)).isEqualTo("II");
  }

  @Test
  public void should_convert_arabic_3_to_roman_III() throws Exception {
    assertThat(converter.convert(3)).isEqualTo("III");
  }

  @Test
  public void should_convert_arabic_4_to_roman_IV() throws Exception {
    assertThat(converter.convert(4)).isEqualTo("IV");
  }

  @Test
  public void should_convert_arabic_5_to_roman_V() throws Exception {
    assertThat(converter.convert(5)).isEqualTo("V");
  }

  @Test
  public void should_convert_arabic_6_to_roman_VI() throws Exception {
    assertThat(converter.convert(6)).isEqualTo("VI");
  }

  @Test
  public void should_convert_7_8_to_roman_VII_VIII() throws Exception {
    assertThat(converter.convert(7)).isEqualTo("VII");
    assertThat(converter.convert(8)).isEqualTo("VIII");
  }

  @Test
  public void should_convert_9_to_roman_IX() throws Exception {
    assertThat(converter.convert(9)).isEqualTo("IX");
  }

  @Test
  public void should_convert_10_to_roman_X() throws Exception {
    assertThat(converter.convert(10)).isEqualTo("X");
  }

  @Test
  public void should_convert_any_number_to_roman() throws Exception {
    assertThat(converter.convert(45)).isEqualTo("XLV");
    assertThat(converter.convert(94)).isEqualTo("XCIV");
    assertThat(converter.convert(1903)).isEqualTo("MCMIII");
  }

  @Test
  public void should_convert_99_to_XCIC() throws Exception {
    assertThat(converter.convert(99)).isEqualTo("XCIX");
  }
}
